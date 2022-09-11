package jadt.graphics;

public class Font{
    java.awt.Font font;
    String FontName,FontType;
    short size;
    public Font(String FontName,String FontType,short size) {

        if(FontType.equals("Plain"))this.font =new java.awt.Font(FontName, java.awt.Font.PLAIN, size);
        if(FontType.equals("Bold"))this.font = new java.awt.Font(FontName, java.awt.Font.BOLD, size);
        if(FontType.equals("Italic"))this.font = new java.awt.Font(FontName, java.awt.Font.ITALIC, size);
        this.FontName = FontName;
        this.FontType = FontType;
        this.size = size;
    }
    public java.awt.Font getFont()
    {
        return font;
    }
    public void setFont(String FontName,String FontType,short size)
    {
        if(FontType.equals("Plain"))this.font =new java.awt.Font(FontName, java.awt.Font.PLAIN, size);
        if(FontType.equals("Bold"))this.font = new java.awt.Font(FontName, java.awt.Font.BOLD, size);
        if(FontType.equals("Italic"))this.font = new java.awt.Font(FontName, java.awt.Font.ITALIC, size);
        this.FontName = FontName;
        this.FontType = FontType;
        this.size = size;
    }

    public String getFontName() {
        return FontName;
    }

    public void setFontName(String fontName) {
        FontName = fontName;
    }

    public String getFontType() {
        return FontType;
    }

    public void setFontType(String fontType) {
        FontType = fontType;
    }

    public short getSize() {
        return size;
    }

    public void setSize(short size) {
        this.size = size;
    }
}
