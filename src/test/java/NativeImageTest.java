import jadt.core.icon.Icon;
import jadt.graphics.NativeImage;

public class NativeImageTest {
    public static void main(String[] args) {
        testLoadsBundledResource();
        testScalesImage();
        testIconUsesNativeImageScaling();
    }

    private static void testLoadsBundledResource() {
        NativeImage image = NativeImage.fromPath("/jadt/resources/error.png");
        TestSupport.assertNotNull(image.getBufferedImage(), "Buffered image should be loaded");
        TestSupport.assertTrue(image.getWidth() > 0, "Image width should be positive");
        TestSupport.assertTrue(image.getHeight() > 0, "Image height should be positive");
    }

    private static void testScalesImage() {
        NativeImage image = NativeImage.fromPath("/jadt/resources/error.png");
        NativeImage scaled = image.scaled(32, 24);

        TestSupport.assertEquals(32, scaled.getWidth(), "Scaled image width should match");
        TestSupport.assertEquals(24, scaled.getHeight(), "Scaled image height should match");
    }

    private static void testIconUsesNativeImageScaling() {
        Icon icon = new Icon("/jadt/resources/error.png", 20, 18);

        TestSupport.assertEquals(20, icon.getIconWidth(), "Icon width should reflect requested scale");
        TestSupport.assertEquals(18, icon.getIconHeight(), "Icon height should reflect requested scale");
        TestSupport.assertNotNull(icon.getNativeImage(), "Icon should expose the underlying native image");
    }
}
