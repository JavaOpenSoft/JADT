package jadt.core;

import javax.swing.*;

public class PopupMenu extends JADT_Component{
    private JPopupMenu jPopupMenu = new JPopupMenu();

    @Override
    public JPopupMenu getComponent() {
        return jPopupMenu;
    }

    @Override
    public void setSize(int SizeX, int SizeY) {
        jPopupMenu.setSize(SizeX, SizeY);
    }
    @Override
    public void setLocation(int PositionX, int PositionY) {
        jPopupMenu.setLocation(PositionX, PositionY);
    }
    public void setForegroundColor(jadt.graphics.Color color) {

    }
}
