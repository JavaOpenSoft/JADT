package juit.Core;

import javax.swing.*;

public class PasswordField {
    JPasswordField jPasswordField = new JPasswordField();
    private int PositionX,PositionY,SizeX,SizeY;
    String Text;
    public int getPositionX() {
        return PositionX;
    }

    public int getPositionY() {
        return PositionY;
    }

    public int getSizeX() {
        return SizeX;
    }

    public int getSizeY() {
        return SizeY;
    }
    public void setSize(int SizeX, int SizeY)
    {
        jPasswordField.setSize(SizeX,SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setPosition(int PositionX, int PositionY)
    {
        jPasswordField.setBounds(PositionX,PositionY,SizeX,SizeY);
    }
    public void setText(String Text)
    {
        jPasswordField.setText(Text);
        this.Text = Text;
    }
    public String getText()
    {
        return this.Text;
    }

}
