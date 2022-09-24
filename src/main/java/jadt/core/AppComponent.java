package jadt.core;

public abstract class AppComponent extends java.awt.Container {
    int sizeX;
    int sizeY;
    int positionX;
    int positionY;
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
}