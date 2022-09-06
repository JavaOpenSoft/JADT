package juit.Graphics;

public class Font {
    java.awt.Font f;
    String FontName,FontType;
    short size;
    public Font(String FontName,String FontType,short size) {

        if(FontType.equals("Plain"))this.f=new java.awt.Font(FontName, java.awt.Font.PLAIN, size);
        if(FontType.equals("Bold"))this.f= new java.awt.Font(FontName, java.awt.Font.BOLD, size);
        if(FontType.equals("Italic"))this.f= new java.awt.Font(FontName, java.awt.Font.ITALIC, size);
        this.FontName = FontName;
        this.FontType = FontType;
        this.size = size;
    }
    public java.awt.Font getFont()
    {
        return f;
    }
    public void setFont(String FontName,String FontType,short size)
    {
        if(FontType.equals("Plain"))this.f=new java.awt.Font(FontName, java.awt.Font.PLAIN, size);
        if(FontType.equals("Bold"))this.f= new java.awt.Font(FontName, java.awt.Font.BOLD, size);
        if(FontType.equals("Italic"))this.f= new java.awt.Font(FontName, java.awt.Font.ITALIC, size);
        this.FontName = FontName;
        this.FontType = FontType;
        this.size = size;
    }
}
