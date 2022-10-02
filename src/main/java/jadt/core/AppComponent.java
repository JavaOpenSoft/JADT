package jadt.core;

import javax.swing.*;
import java.awt.*;

public abstract class AppComponent extends Component {
    private int sizeX;
    private int sizeY;
    private int positionX;
    private int positionY;
    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    @Override
    public void show() {
    }
    @Override
    public void hide() {
    }
    public Container getComponent() {return new Container();}
    public void setTheme(LookAndFeel lookAndFeel) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(lookAndFeel);
    }
}