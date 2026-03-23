import jadt.core.icon.Icon;
import jadt.graphics.NativeImage;
import jadt.utils.Resources;

import java.net.URL;

public class ResourcesTest {
    public static void main(String[] args) {
        testResourceLookup();
        testImageHelper();
        testIconHelper();
    }

    private static void testResourceLookup() {
        URL resource = Resources.get("/jadt/resources/error.png");
        TestSupport.assertNotNull(resource, "Resource lookup should return a URL");
    }

    private static void testImageHelper() {
        NativeImage image = Resources.image("/jadt/resources/error.png");
        TestSupport.assertTrue(image.getWidth() > 0, "Helper-loaded image should have width");
        TestSupport.assertTrue(image.getHeight() > 0, "Helper-loaded image should have height");
    }

    private static void testIconHelper() {
        Icon icon = Resources.icon("/jadt/resources/error.png", 16, 16);
        TestSupport.assertEquals(16, icon.getIconWidth(), "Helper-created icon should use the requested width");
        TestSupport.assertEquals(16, icon.getIconHeight(), "Helper-created icon should use the requested height");
    }
}
