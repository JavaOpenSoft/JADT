package jadt.core.icon;

import java.awt.*;

public class Icon implements javax.swing.Icon {
    private int IconWidth = 0;
    private int IconHeight = 0;
    public void setIconWidth(){
        this.IconWidth = IconWidth;
        this.IconHeight = IconHeight;
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
