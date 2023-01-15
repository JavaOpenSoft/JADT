package jadt.graphics;

public class Color extends java.awt.Color{
    public static final Color Black = new Color(0,0,0);
    public static final Color White = new Color(255,255,255);
    public static final Color Red = new Color(255,0,0);
    public static final Color Lime = new Color(0,255,0);
    public static final Color Blue = new Color(0,0,255);
    public static final Color Yellow = new Color(255,255,0);
    public static final Color Cyan = new Color(0,255,255);
    public static final Color Magenta = new Color(255,0,255);
    public static final Color Silver = new Color(192,192,192);
    public static final Color Gray = new Color(128,128,128);
    public static final Color Maroon = new Color(128,0,0);
    public static final Color Olive = new Color(128,128,0);
    public static final Color Green = new Color(0,128,0);
    public static final Color Purple = new Color(128,0,128);
    public static final Color Teal = new Color(0,128,128);
    public static final Color Navy = new Color(0,0,128);
    public static final Color Gold = new Color(255,215,0);
    public static final Color DeepPink = new Color(255,215,0);
    public static final Color Pink = new Color(255,105,180);
    public static final Color Orange = new Color(255,165,0);
    public static final Color HotPink = new Color(255,0, 100);
    public static final Color Bronze = new Color(205, 127, 50);
    public static final Color CalmBlue = new Color(0,132,255);
    public static final Color LightIceBlue = new Color(0,200,233);
    public static final Color IceBlue = new Color(0,242,255);
    public static final Color DarkIceBlue = new Color(198,220,245);
    public static final Color SmokeGray = new Color(207, 207, 207);


    public Color(int r, int g, int b) {
        super(r, g, b);
    }
    public String getRGB(int[] colorIndex){
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < colorIndex.length-1; i++)
        {
            temp.append(colorIndex[i]);
        }
        return temp.toString();
    }
    public Color convertHexToRGB(String hex)
    {
        return (Color) decode(hex);
    }
    public String convertRGBToHex(short r, short g, short b)
    {
        return "#"+Integer.toHexString(new java.awt.Color(r, g, b).getRGB()).substring(2);
    }
    public float[] convertRGBToHSV(int r, int g, int b)
    {
        return java.awt.Color.RGBtoHSB(r, g, b, null);

    }
    public float[] convertRGBToHSV(int[] colorIndexes)
    {
        return java.awt.Color.RGBtoHSB(colorIndexes[0], colorIndexes[1], colorIndexes[2], null);
    }
    public int[] convertHSVToRGB(int h, int s, int v)
    {
        int[] i = new int[3];
        int rgb = java.awt.Color.HSBtoRGB(h, s, v);
        i[0] = (rgb>>16)&0xFF;
        i[1] = (rgb>>8)&0xFF;
        i[2] = (rgb>>8)&0xFF;
        return i;
    }
}
