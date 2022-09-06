package juit.Core;

import javax.swing.*;

public class Separator {
    JSeparator jSeparator = new JSeparator();
    int SizeX,SizeY,PositionX,PositionY;

    public int getSizeX() {
        return SizeX;
    }

    public int getSizeY() {
        return SizeY;
    }

    public int getPositionX() {
        return PositionX;
    }

    public int getPositionY() {
        return PositionY;
    }

    public void setSize(int SizeX, int SizeY)
    {
        jSeparator.setSize(SizeX,SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setPosition(int PositionX,int PositionY)
    {
        jSeparator.setBounds(PositionX,PositionY,SizeX,SizeY);
    }
    public JSeparator getSeperator()
    {
        return jSeparator;
    }
}
