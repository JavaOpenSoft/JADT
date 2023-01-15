package jadt;

import java.awt.Component;

public abstract class JADTComponent {
    public void setSize(int sizeX, int sizeY) {
    }

    public void setPosition(int positionX, int positionY) {
    }

    public void setBounds(int sizeX, int sizeY, int positionX, int positionY) {
    }

    public void setDraggable(boolean draggable) {

    }
    public void setFocusable(boolean focusable) {

    }
    public Component getComponent(){
        return null;
    }
}