package jadt.core;

import javax.swing.*;
import javax.swing.event.HyperlinkListener;


public class EditorPane extends AppComponent{
    private JEditorPane jeditorPane = new JEditorPane();
    private short sizeX = 600;
    private short sizeY = 600;
    private short positionY = 0;
    private short positionX = 0;
    private boolean isVisible = true;
    public boolean isShown() {
        return isVisible;
    }
    public void show() {
        jeditorPane.setVisible(true);
        this.isVisible = true;
    }
    public void hide() {
        jeditorPane.setVisible(false);
        this.isVisible = false;
    }
    public void addHyperLinkListener(HyperlinkListener listener)
    {
        jeditorPane.addHyperlinkListener(listener);
    }
    public void removeHyperLinkListener(HyperlinkListener listener)
    {
        jeditorPane.removeHyperlinkListener(listener);
    }
    public void setPosition(short positionX, short positionY){
        jeditorPane.setBounds(positionX, positionY,sizeX,sizeY);
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public void setSize(short sizeX, short sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        jeditorPane.setSize(sizeX,sizeY);
    }
    public void setBounds(short sizeX, short sizeY, short positionX, short positionY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.positionX = positionX;
        this.positionY = positionY;
        jeditorPane.setBounds(positionX, positionY, sizeX, sizeY);
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public short getpositionY() {
        return positionY;
    }

    public short getpositionX() {
        return positionX;
    }
    public JEditorPane getComponent(){
        return jeditorPane;
    }
}