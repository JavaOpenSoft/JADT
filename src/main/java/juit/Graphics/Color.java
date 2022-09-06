package juit.Graphics;

public class Color {
    java.awt.Color color;
    public final int[] Black = {0,0,0};
    public final int[] White = {256,256,256};
    public final int[] Red = {256,0,0};
    public final int[] Lime = {0,256,0};
    public final int[] Blue = {0,0,256};
    public final int[] Yellow = {256,256,0};
    public final int[] Cyan = {0,256,256};
    public final int[] Magenta = {256,0,256};
    public final int[] Silver = {192,192,192};
    public final int[] Gray = {128,128,128};
    public final int[] Maroon = {128,0,0};
    public final int[] Olive = {128,128,0};
    public final int[] Green = {0,128,0};
    public final int[] Purple = {128,0,128};
    public final int[] Teal = {0,128,128};
    public final int[] Navy = {0,0,128};
    public final int[] Gold = {255,215,0};
    public final int[] Deep_pink = {255,215,0};
    public final int[] Pink = {255,105,180};
    public final int[] Orange = {255,165,0};
    public final int[] HotPink = {255,0, 100};
    public final int[] Bronze = {205, 127, 50};
    public final int[] CalmBlue = {0,153, 255};
    public final int[] LightIceBlue = {200,233,233};
    public final int[] IceBlue = {207,242,255};
    public final int[] DarkIceBlue = {198,220,245};
    public final int[] SmokeGray = {207, 207, 207};
    private short r;
    private short g;
    private short b;

    public Color(int r, int g, int b)
    {
        this.color = new java.awt.Color(r,g,b);
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
    public void changeR(short r)
    {
        this.r = r;
        this.color = new java.awt.Color(r,g,b);
    }
    public void changeG(short g)
    {
        this.g = g;
        this.color = new java.awt.Color(r,g,b);
    }
    public void changeB(short b)
    {
        this.b = b;
        this.color = new java.awt.Color(r,g,b);
    }
    public void changeRGB(short r,short g, short b)
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

}
