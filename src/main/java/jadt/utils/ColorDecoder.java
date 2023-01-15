package jadt.utils;

import java.awt.Color;

public class ColorDecoder {
    public String convertHexToRGB(String hex)
    {
        return String.valueOf(Color.decode(hex));
    }
    public String convertRGBToHex(short r, short g, short b)
    {
        Color temp = new Color(r, g, b);
        return "#"+Integer.toHexString(temp.getRGB()).substring(2);
    }
    public float[] convertRGBToHSV(int r, int g, int b)
    {
        return Color.RGBtoHSB(r, g, b, null);

    }
    public float[] convertRGBToHSV(int[] colorIndexes)
    {
        return Color.RGBtoHSB(colorIndexes[0], colorIndexes[1], colorIndexes[2], null);
    }
    public int[] convertHSVToRGB(int h, int s, int v)
    {
        int[] i = new int[4];
        int rgb = Color.HSBtoRGB(h, s, v);
        i[0] = (rgb>>16)&0xFF;
        i[1] = (rgb>>8)&0xFF;
        i[2] = (rgb>>8)&0xFF;
        i[3] = rgb;
        return i;
    }
    public int[] convertHSVToRGB(int[] value)
    {
        int[] i = new int[4];
        int rgb = Color.HSBtoRGB(value[0], value[1], value[2]);
        i[0] = (rgb>>16)&0xFF;
        i[1] = (rgb>>8)&0xFF;
        i[2] = (rgb>>8)&0xFF;
        i[3] = rgb;
        return i;
    }
}
