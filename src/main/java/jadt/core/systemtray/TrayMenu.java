package jadt.core.systemtray;

import java.awt.*;

public class TrayMenu {
    private PopupMenu menu = new PopupMenu();
    public PopupMenu getComponent(){
        return menu;
    }
    public void add(TrayMenuItem trayMenuItem){
        menu.add(trayMenuItem.getComponent());
    }
    public void remove(TrayMenuItem trayMenuItem) {
        menu.remove(trayMenuItem.getComponent());
    }
}
