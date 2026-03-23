package jadt.utils;

import jadt.core.icon.Icon;
import jadt.graphics.NativeImage;

import java.net.URL;

public final class Resources {
    private Resources() {
    }

    public static URL get(String path) {
        URL resource = Resources.class.getResource(path);
        if (resource != null) {
            return resource;
        }

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader != null) {
            URL classpathResource = classLoader.getResource(stripLeadingSlash(path));
            if (classpathResource != null) {
                return classpathResource;
            }
        }

        throw new IllegalArgumentException("Resource not found: " + path);
    }

    public static NativeImage image(String path) {
        return NativeImage.fromPath(path);
    }

    public static NativeImage image(Class<?> owner, String path) {
        return NativeImage.fromResource(owner, path);
    }

    public static Icon icon(String path) {
        return new Icon(path);
    }

    public static Icon icon(String path, int width, int height) {
        return new Icon(path, width, height);
    }

    private static String stripLeadingSlash(String path) {
        if (path.startsWith("/")) {
            return path.substring(1);
        }
        return path;
    }
}
