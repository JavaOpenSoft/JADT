package jadt.utils;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FontUtils {
    GraphicsEnvironment graphicsEnvironment;
    public FontUtils() {
        graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    }
    public void loadCustomFont(String FontFile) throws IOException, FontFormatException {
        graphicsEnvironment.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(FontFile)));
    }
}
