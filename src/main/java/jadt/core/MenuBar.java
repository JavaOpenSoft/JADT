package jadt.core;

import javax.swing.*;

public class MenuBar {
    private JMenuBar menuBar = new JMenuBar();
    private int PositionX;
    private int PositionY;
    private int SizeX;
    private int SizeY;

    public void add(Menu menu){
        menuBar.add(menu.getComponent());
    }

    public void remove(Menu menu)
    {
        menuBar.remove(menu.getComponent());
    }
    public void setSize(int SizeX, int SizeY)
    {
        menuBar.setSize(SizeX, SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setPosition(int PositionX, int PositionY)
    {
        menuBar.setBounds(PositionX, PositionY, SizeX, SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }
    public void setBounds(int PositionX, int PositionY, int SizeX, int SizeY){
        menuBar.setBounds(PositionX, PositionY, SizeX, SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public JMenuBar getComponent(){
        return menuBar;
    }
}
