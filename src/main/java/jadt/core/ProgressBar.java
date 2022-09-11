package jadt.core;

import javax.swing.JProgressBar;
import java.awt.Color;

public class ProgressBar{
    private final JProgressBar progressBar;
    int SizeX,SizeY,PositionX,PositionY;

    public ProgressBar(int value) {
        progressBar = new JProgressBar(value);
        progressBar.setStringPainted(true);
    }
    public void setProgressBarProgress(int progress) {
        progressBar.setValue(progress);
    }
    public void setSize(int SizeX, int SizeY)
    {
        progressBar.setSize(SizeX,SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setPosition(int PositionX, int PositionY)
    {
        progressBar.setBounds(PositionX,PositionY,SizeX,SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }
    public void changeColor(Color color)
    {
        progressBar.setForeground(color);
    }
    public int getProgressValue(){
        return progressBar.getValue();
    }
    public void setProgressValue(int progress){
        progressBar.setValue(progress);
    }

    public int getSizeX() {
        return SizeX;
    }

    public int getSizeY() {
        return SizeY;
    }

    public int getPositionX() {
        return PositionX;
    }

    public int getPositionY() {
        return PositionY;
    }
    public void setDraggable(boolean isDraggable) {
        if (isDraggable) {
            
        }

    }
}