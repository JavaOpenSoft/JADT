package jadt.core;

import javax.swing.*;

@SuppressWarnings("FieldMayBeFinal")
public class ToggleSwitch {
    private int positionX;
    private int positionY;
    private int sizeX;
    private int sizeY;
    @SuppressWarnings("FieldMayBeFinal")
    private JToggleButton jToggleButton = new JToggleButton();

    public String getText() {
        return jToggleButton.getText();
    }
    public int getPositionX() {
        return positionX;
    }
    public int getPositionY() {
        return positionY;
    }
    public int getSizeX() {
        return sizeX;
    }
    public int getSizeY() {
        return sizeY;
    }
    public JToggleButton getComponent(){
        return jToggleButton;
    }
    public void setState(boolean state){
        jToggleButton.setEnabled(state);
    }
    public void show(){
        jToggleButton.setVisible(true);
    }
    public void hide(){
        jToggleButton.setVisible(false);
    }
    public void setBounds(int sizeX, int sizeY,int positionX, int positionY){
        jToggleButton.setBounds(positionX,positionY,sizeX,sizeY);
        this.positionX = positionX;
        this.positionY = positionY;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    
}
