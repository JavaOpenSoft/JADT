package jadt.graphics;

public class Color extends java.awt.Color{
    private java.awt.Color color;
    public final java.awt.Color Black = new java.awt.Color(0,0,0);
    public final java.awt.Color White = new java.awt.Color(255,255,255);
    public final java.awt.Color Red = new java.awt.Color(255,0,0);
    public final java.awt.Color Lime = new java.awt.Color(0,255,0);
    public final java.awt.Color Blue = new java.awt.Color(0,0,255);
    public final java.awt.Color Yellow = new java.awt.Color(255,255,0);
    public final java.awt.Color Cyan = new java.awt.Color(0,255,255);
    public final java.awt.Color Magenta = new java.awt.Color(255,0,255);
    public final java.awt.Color Silver = new java.awt.Color(192,192,192);
    public final java.awt.Color Gray = new java.awt.Color(128,128,128);
    public final java.awt.Color Maroon = new java.awt.Color(128,0,0);
    public final java.awt.Color Olive = new java.awt.Color(128,128,0);
    public final java.awt.Color Green = new java.awt.Color(0,128,0);
    public final java.awt.Color Purple = new java.awt.Color(128,0,128);
    public final java.awt.Color Teal = new java.awt.Color(0,128,128);
    public final java.awt.Color Navy = new java.awt.Color(0,0,128);
    public final java.awt.Color Gold = new java.awt.Color(255,215,0);
    public final java.awt.Color Deep_pink = new java.awt.Color(255,215,0);
    public final java.awt.Color Pink = new java.awt.Color(255,105,180);
    public final java.awt.Color Orange = new java.awt.Color(255,165,0);
    public final java.awt.Color HotPink = new java.awt.Color(255,0, 100);
    public final java.awt.Color Bronze = new java.awt.Color(205, 127, 50);
    public final java.awt.Color CalmBlue = new java.awt.Color(255,0,153, 255);
    public final java.awt.Color LightIceBlue = new java.awt.Color(255,200,233,233);
    public final java.awt.Color IceBlue = new java.awt.Color(207,242,255);
    public final java.awt.Color DarkIceBlue = new java.awt.Color(198,220,245);
    public final java.awt.Color SmokeGray = new java.awt.Color(207, 207, 207);
    private short r;
    private short g;
    private short b;

    public Color(int r, int g, int b) {
        super(r, g, b);
        this.r = (short)r;
        this.g = (short)g;
        this.b = (short)b;
    }

    public int getR(int[] colorIndex)
    {
        return colorIndex[0];
    }

    public int getG(int[] colorIndex)
    {
        return colorIndex[1];
    }
    public int getB(int[] colorIndex)
    {
        return colorIndex[2];
    }
    public String getRGB(int[] colorIndex){
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < colorIndex.length-1; i++)
        {
            temp.append(colorIndex[i]);
        }
        return temp.toString();
    }
    public void changeRed(short r)
    {
        this.r = r;
        this.color = new java.awt.Color(r,g,b);
    }
    public void changeGreen(short g)
    {
        this.g = g;
        this.color = new java.awt.Color(r,g,b);
    }
    public void changeBlue(short b)
    {
        this.b = b;
        this.color = new java.awt.Color(r,g,b);
    }

    public java.awt.Color getColor() {
        return color;
    }

    public void changeRGB(short r, short g, short b)
    {
        this.color = new java.awt.Color(r,g,b);
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public void changeRGB(int[] colorIndex)
    {
      this.color = new java.awt.Color(colorIndex[0],colorIndex[1],colorIndex[2]);
      colorIndex[0] = this.r;
      colorIndex[1] = this.g;
      colorIndex[2] = this.b;
    }
    public String ConvertHexToRGB(String hex)
    {
        return String.valueOf(java.awt.Color.decode(hex));
    }
    public String ConvertRGBToHex(short r, short g, short b)
    {
        java.awt.Color temp = new java.awt.Color(r, g, b);
        return "#"+Integer.toHexString(temp.getRGB()).substring(2);
    }
    public float[] ConvertRGBToHSV(int r, int g, int b)
    {
        return java.awt.Color.RGBtoHSB(r, g, b, null);

    }
    public float[] ConvertRGBToHSV(int[] colorIndexes)
    {
        return java.awt.Color.RGBtoHSB(colorIndexes[0], colorIndexes[1], colorIndexes[2], null);
    }
    public int[] ConvertHSVToRGB(int h, int s, int v)
    {
        int[] i = new int[4];
        int rgb = java.awt.Color.HSBtoRGB(h, s, v);
        i[0] = (rgb>>16)&0xFF;
        i[1] = (rgb>>8)&0xFF;
        i[2] = (rgb>>8)&0xFF;
        i[3] = rgb;
        return i;
    }

}
