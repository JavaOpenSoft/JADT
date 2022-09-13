package jadt.core;

import javax.swing.*;
import javax.swing.event.HyperlinkListener;


public class EditorPane {
    private JEditorPane jeditorPane = new JEditorPane();
    private short SizeX = 600;
    private short SizeY = 600;
    private short PositionY = 0;
    private short PositionX = 0;
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
    public void setPosition(short PositionX, short PositionY){
        jeditorPane.setBounds(PositionX, PositionY,SizeX,SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }
    public void setSize(short SizeX, short SizeY){
        this.SizeX = SizeX;
        this.SizeY = SizeY;
        jeditorPane.setSize(SizeX,SizeY);
    }
    public void setBounds(short SizeX, short SizeY, short PositionX, short PositionY){
        this.SizeX = SizeX;
        this.SizeY = SizeY;
        this.PositionX = PositionX;
        this.PositionY = PositionY;
        jeditorPane.setBounds(PositionX, PositionY, SizeX, SizeY);
    }

    public short getSizeX() {
        return SizeX;
    }

    public short getSizeY() {
        return SizeY;
    }

    public short getPositionY() {
        return PositionY;
    }

    public short getPositionX() {
        return PositionX;
    }
    public JEditorPane getComponent(){
        return jeditorPane;
    }
}