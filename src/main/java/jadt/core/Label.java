package jadt.core;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.Icon;

public class Label extends AppComponent{
    int positionX = 0;
    int positionY = 0;
    int sizeX = 100;
    int sizeY = 100;
    private final JLabel label = new JLabel();
    private String FontName;
    private String FontType;
    private short size;

    public Label(String Text, int sizeX, int sizeY)
    {
        label.setText(Text);
        label.setSize(sizeX,sizeY);
    }
    public Label(String Text, int sizeX, int sizeY,int positionX,int positionY)
    {
        label.setText(Text);
        label.setBounds(positionX,positionY,sizeX,sizeY);
        this.positionX = positionX;
        this.positionY = positionY;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public Label(String Text, Icon icon){
        label.setText(Text);
        label.setIcon(icon);
    }
    public Label(String Text) {
        label.setText(Text);
    }

    public void setLabelText(String Text)
    {
        label.setText(Text);
    }
    public JLabel getComponent()
    {return label;}
    public int GetPositionX()
    {return positionX;}
    public int GetPositionY()
    {
        return positionY;
    }
    public int getSizeX()
    {
        return sizeX;
    }
    public int getSizeY()
    {
        return sizeY;
    }
    public void SetPosition(int positionX,int positionY)
    {
        label.setBounds(this.sizeX,this.sizeY,positionX,positionY);
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
    public void setSize(int SizeX, int sizeY){
        label.setSize(SizeX, sizeY);
        this.sizeX = SizeX;

        this.sizeY = sizeY;
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
