package juit.Core;

import javax.swing.*;


public class RadioButton {
    JRadioButton jRadioButton = new JRadioButton();
    int SizeX,SizeY,PositionX,PositionY;
    String Text;
    public boolean isSelected()
    {
        return jRadioButton.isSelected();
    }
    public void setText(String Text)
    {
        jRadioButton.setText(Text);
        this.Text = Text;
    }
    public void setSize(int SizeX, int SizeY)
    {
        jRadioButton.setSize(SizeX,SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setPosition(int PositionX,int PositionY)
    {
        jRadioButton.setBounds(PositionX,PositionY,SizeX,SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }
    public String getText()
    {
        return Text;
    }
    public int getSizeX(){
        return SizeX;
    }
    public int getSizeY()
    {
        return  SizeY;
    }
    public int getPositionX(){
        return PositionX;
    }
    public int getPositionY()
    {
        return PositionY;
    }
}
