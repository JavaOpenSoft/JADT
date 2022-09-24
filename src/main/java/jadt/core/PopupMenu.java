package jadt.core;

import javax.swing.*;

public class PopupMenu{
    private JPopupMenu jPopupMenu = new JPopupMenu();

    public JPopupMenu getComponent() {
        return jPopupMenu;
    }

    public void setSize(int SizeX, int sizeY) {
        jPopupMenu.setSize(SizeX, sizeY);
    }

    public void setLocation(int positionX, int positionY) {
        jPopupMenu.setLocation(positionX, positionY);
    }
    public void setForegroundColor(jadt.graphics.Color color) {
        jPopupMenu.setForeground(color);
    }
}
