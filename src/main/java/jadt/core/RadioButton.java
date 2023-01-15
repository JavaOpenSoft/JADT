package jadt.core;

import jadt.JADTComponent;

import javax.swing.*;


@SuppressWarnings("FieldMayBeFinal")
public class RadioButton extends JADTComponent {
    @SuppressWarnings("FieldMayBeFinal")
    private JRadioButton jRadioButton = new JRadioButton();
    int sizeX,sizeY,positionX,positionY;
    private String Text;
    public boolean isSelected()
    {
        return jRadioButton.isSelected();
    }
    public void setText(String Text)
    {
        jRadioButton.setText(Text);
        this.Text = Text;
    }
    public void setSize(int sizeX, int sizeY)
    {
        jRadioButton.setSize(sizeX,sizeY);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public void setPosition(int positionX,int positionY)
    {
        jRadioButton.setBounds(positionX,positionY,sizeX,sizeY);
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public String getText()
    {
        return Text;
    }
    public int getSizeX(){
        return sizeX;
    }
    public int getSizeY()
    {
        return  sizeY;
    }
    public int getPositionX(){
        return positionX;
    }
    public int getPositionY()
    {
        return positionY;
    }
    public JRadioButton getComponent() {
        return jRadioButton;
    }
    public void setEnabled(boolean isEnabled) {
        jRadioButton.setEnabled(isEnabled);
    }
    public boolean isEnabled() {
        return jRadioButton.isEnabled();
    }
}
