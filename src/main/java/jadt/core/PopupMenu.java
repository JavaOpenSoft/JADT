package jadt.core;

import jadt.JADTComponent;

import javax.swing.*;

@SuppressWarnings("FieldMayBeFinal")
public class PopupMenu extends JADTComponent {
    @SuppressWarnings("FieldMayBeFinal")
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
