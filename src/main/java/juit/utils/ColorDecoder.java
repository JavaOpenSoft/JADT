package juit.utils;

import java.awt.Color;

public class ColorDecoder {
    public String ConvertHexToRGB(String hex)
    {
        return String.valueOf(Color.decode(hex));
    }
    public String ConvertRGBToHex(short r, short g, short b)
    {
        Color temp = new Color(r, g, b);
        return "#"+Integer.toHexString(temp.getRGB()).substring(2);
    }
    public float[] ConvertRGBToHSV(int r, int g, int b)
    {
        return Color.RGBtoHSB(r, g, b, null);

    }
    public float[] ConvertRGBToHSV(int[] colorIndexes)
    {
        return Color.RGBtoHSB(colorIndexes[0], colorIndexes[1], colorIndexes[2], null);
    }
    public int[] ConvertHSVToRGB(int h, int s, int v)
    {
        int[] i = new int[4];
        int rgb = Color.HSBtoRGB(h, s, v);
        i[0] = (rgb>>16)&0xFF;
        i[1] = (rgb>>8)&0xFF;
        i[2] = (rgb>>8)&0xFF;
        i[3] = rgb;
        return i;
    }
}
