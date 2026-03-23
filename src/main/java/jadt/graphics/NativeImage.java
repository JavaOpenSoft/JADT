package jadt.graphics;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class NativeImage {
    private final BufferedImage bufferedImage;
    private final String source;

    private NativeImage(BufferedImage bufferedImage, String source) {
        this.bufferedImage = Objects.requireNonNull(bufferedImage, "bufferedImage");
        this.source = source;
    }

    public static NativeImage fromPath(String path) {
        File file = new File(path);
        if (file.isFile()) {
            try {
                return new NativeImage(ImageIO.read(file), file.getAbsolutePath());
            } catch (IOException e) {
                throw new IllegalArgumentException("Could not load image from path: " + path, e);
            }
        }

        URL resource = NativeImage.class.getResource(path);
        if (resource != null) {
            try {
                return new NativeImage(ImageIO.read(resource), resource.toExternalForm());
            } catch (IOException e) {
                throw new IllegalArgumentException("Could not load image resource: " + path, e);
            }
        }

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader != null) {
            URL classpathResource = classLoader.getResource(stripLeadingSlash(path));
            if (classpathResource != null) {
                try {
                    return new NativeImage(ImageIO.read(classpathResource), classpathResource.toExternalForm());
                } catch (IOException e) {
                    throw new IllegalArgumentException("Could not load classpath image: " + path, e);
                }
            }
        }

        throw new IllegalArgumentException("Image not found: " + path);
    }

    public static NativeImage fromResource(Class<?> owner, String path) {
        URL resource = owner.getResource(path);
        if (resource == null) {
            throw new IllegalArgumentException("Image resource not found: " + path);
        }
        try {
            return new NativeImage(ImageIO.read(resource), resource.toExternalForm());
        } catch (IOException e) {
            throw new IllegalArgumentException("Could not load image resource: " + path, e);
        }
    }

    public static NativeImage fromUrl(URL url) {
        try {
            return new NativeImage(ImageIO.read(url), url.toExternalForm());
        } catch (IOException e) {
            throw new IllegalArgumentException("Could not load image url: " + url, e);
        }
    }

    public static NativeImage fromImage(Image image) {
        if (image instanceof BufferedImage bufferedImage) {
            return new NativeImage(bufferedImage, null);
        }
        int width = Math.max(image.getWidth(null), 1);
        int height = Math.max(image.getHeight(null), 1);
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics = bufferedImage.createGraphics();
        try {
            graphics.drawImage(image, 0, 0, null);
        } finally {
            graphics.dispose();
        }
        return new NativeImage(bufferedImage, null);
    }

    public NativeImage scaled(int width, int height) {
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics = resized.createGraphics();
        try {
            graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            graphics.drawImage(bufferedImage, 0, 0, width, height, null);
        } finally {
            graphics.dispose();
        }
        return new NativeImage(resized, source);
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    public Image getImage() {
        return bufferedImage;
    }

    public ImageIcon getImageIcon() {
        return new ImageIcon(bufferedImage);
    }

    public int getWidth() {
        return bufferedImage.getWidth();
    }

    public int getHeight() {
        return bufferedImage.getHeight();
    }

    public String getSource() {
        return source;
    }

    private static String stripLeadingSlash(String path) {
        if (path.startsWith("/")) {
            return path.substring(1);
        }
        return path;
    }
}
