package jadt.core;

import javax.swing.*;
@SuppressWarnings("all")
public class MenuBar {
    private JMenuBar menuBar = new JMenuBar();
    private int positionX;
    private int positionY;
    private int sizeX;
    private int sizeY;

    public void add(Menu menu){
        menuBar.add(menu.getComponent());
    }

    public void remove(Menu menu)
    {
        menuBar.remove(menu.getComponent());
    }
    public void setSize(int sizeX, int sizeY)
    {
        menuBar.setSize(sizeX, sizeY);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public void setPosition(int positionX, int positionY)
    {
        menuBar.setLocation(positionX, positionY);
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public void setBounds(int positionX, int positionY, int sizeX, int sizeY){
        menuBar.setBounds(positionX, positionY, sizeX, sizeY);
        this.positionX = positionX;
        this.positionY = positionY;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public JMenuBar getComponent(){
        return menuBar;
    }
}
