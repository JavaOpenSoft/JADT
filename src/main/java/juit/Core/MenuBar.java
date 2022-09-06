package juit.Core;

import javax.swing.*;

public class MenuBar {
    JMenuBar menuBar = new JMenuBar();
    public void setDifferentMenuBar(MenuBar menuBar) {
        this.menuBar = menuBar.menuBar;
    }
    public void add(Menu menu){
        menuBar.add(menu.menu);
    }
    public void remove(Menu menu)
    {
        menuBar.remove(menu.menu);
    }

}
