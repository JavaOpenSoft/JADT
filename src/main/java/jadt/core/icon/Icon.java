package jadt.core.icon;

import java.awt.*;

public class Icon implements javax.swing.Icon {
    private int IconWidth = 100;
    private int IconHeight = 100;
    public void setIconWidth(int iconWidth , int iconHeight) {
        this.IconWidth = iconWidth;
        this.IconHeight = iconHeight;
    }
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
    }

    @Override
    public int getIconWidth() {
        return IconWidth;
    }

    @Override
    public int getIconHeight() {
        return IconHeight;
    }
}
