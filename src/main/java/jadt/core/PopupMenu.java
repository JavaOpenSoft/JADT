package jadt.core;

import javax.swing.*;

public class PopupMenu{
    private JPopupMenu jPopupMenu = new JPopupMenu();

    public JPopupMenu getComponent() {
        return jPopupMenu;
    }

    public void setSize(int SizeX, int SizeY) {
        jPopupMenu.setSize(SizeX, SizeY);
    }

    public void setLocation(int PositionX, int PositionY) {
        jPopupMenu.setLocation(PositionX, PositionY);
    }
    public void setForegroundColor(jadt.graphics.Color color) {
        jPopupMenu.setForeground(color);
    }
}
