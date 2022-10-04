package jadt.core;

import javax.swing.*;

@SuppressWarnings("FieldMayBeFinal")
public class TextArea {
    @SuppressWarnings("FieldMayBeFinal")
    private JTextArea jTextArea = new JTextArea();
    private int positionX;
    private int positionY;
    private int sizeX;
    private int sizeY;
    public JTextArea getComponent() {
        return jTextArea;
    }
    public void setText(String Text){
        this.jTextArea.setText(Text);
    }
    public void setSize(int sizeX, int sizeY) {
        this.jTextArea.setSize(sizeX, sizeY);
        this.sizeX = sizeX;
        this.sizeY = sizeY;

    }
    public void setPosition(int positionX, int positionY) {
        jTextArea.setBounds(positionX, positionY,sizeX,sizeY);
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public void setBounds(int sizeX, int sizeY,int positionX, int positionY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.positionX = positionX;
        this.positionY = positionY;
        jTextArea.setBounds(positionX, positionY,sizeX,sizeY);
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
}
