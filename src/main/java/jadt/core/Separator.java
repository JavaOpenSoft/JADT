package jadt.core;

import javax.swing.*;
import java.beans.PropertyChangeListener;

@SuppressWarnings("FieldMayBeFinal")
public class Separator implements SwingConstants{
    @SuppressWarnings("FieldMayBeFinal")
    private JSeparator separator = new JSeparator();
    int sizeX,sizeY,positionX,positionY;
    public void setOrientation(int Orientation){
        separator.setOrientation(Orientation);
    }
    public void setBounds(int sizeX,int sizeY, int positionX, int positionY){
        separator.setBounds(positionX, positionY, sizeX, sizeY);
    }
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

    public void setSize(int sizeX, int sizeY)
    {
        separator.setSize(sizeX,sizeY);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public void setPosition(int positionX,int positionY)
    {
        separator.setBounds(positionX,positionY,sizeX,sizeY);
    }
    public JSeparator getComponent()
    {
        return separator;
    }
    public void addPropertyChangeListener(PropertyChangeListener listener){
        separator.addPropertyChangeListener(listener);
    }
}
