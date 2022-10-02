package jadt.core;

import javax.swing.*;

public class ToggleSwitch extends AppComponent{
    private int positionX;
    private int positionY;
    private int sizeX;
    private int sizeY;
    private JToggleButton jToggleButton = new JToggleButton();

    public String getText() {
        return jToggleButton.getText();
    }
    @Override
    public int getPositionX() {
        return positionX;
    }
    @Override
    public int getPositionY() {
        return positionY;
    }
    @Override
    public int getSizeX() {
        return sizeX;
    }
    @Override
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
