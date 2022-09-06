package juit.Core;

import javax.swing.*;
import java.awt.*;

public class Label {
    int PositionX,PositionY,SizeX,SizeY;
    JLabel label = new JLabel();
    private String FontName;
    private String FontType;
    private short size;

    public Label(String Text, int SizeX, int SizeY)
    {
        label.setText(Text);
        label.setSize(SizeX,SizeY);
    }
    public Label(String Text, int SizeX, int SizeY,int PositionX,int PositionY)
    {
        label.setText(Text);
        label.setBounds(PositionX,PositionY,SizeX,SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void createLabel(String Text, int SizeX, int SizeY)
    {
        label.setText(Text);
        label.setSize(SizeX,SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setLabelText(String Text)
    {
        label.setText(Text);
    }
    public JLabel getLabel()
    {return label;}
    public int GetPositionX()
    {return PositionX;}
    public int GetPositionY()
    {
        return PositionY;
    }
    public int getSizeX()
    {
        return SizeX;
    }
    public int getSizeY()
    {
        return SizeY;
    }
    public void SetPosition(int PositionX,int PositionY)
    {
        label.setBounds(this.SizeX,this.SizeY,PositionX,PositionY);
    }
    public String getText()
    {
        return label.getText();
    }
    public void setFont(String FontName,String FontType,short size)
    {
        if(FontType.equals("Plain"))label.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))label.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))label.setFont(new Font(FontName, Font.ITALIC, size));
        this.FontName = FontName;
        this.FontType = FontType;
        this.size = size;
    }
    public String getFontName()
    {
        return this.FontName;
    }
    public String getFontType()
    {
        return this.FontType;
    }
    public short getFontSize()
    {
        return this.size;
    }
}
