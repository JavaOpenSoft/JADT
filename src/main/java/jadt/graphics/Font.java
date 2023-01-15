package jadt.graphics;

import java.text.AttributedCharacterIterator;
import java.util.Map;

public class Font extends java.awt.Font{
    public static Font getItalicFont(String fontFamily, int size){
        return new Font(fontFamily, Font.ITALIC, size);
    }
    public static Font getBoldFont(String fontFamily, int size){

        return new Font(fontFamily, Font.BOLD, size);
    }
    public static Font getPlainFont(String fontFamily, int size){
        return new Font(fontFamily, Font.PLAIN, size);
    }
    public Font(String name, int style, int size) {
        super(name, style, size);
    }

    public Font(Map<? extends AttributedCharacterIterator.Attribute, ?> attributes) {
        super(attributes);
    }
    public Font(Font font){
        super(font);
    }
    public Font(java.awt.Font font){
        super(font);
    }
}
