package jadt.core;

import jadt.JADTComponent;

import javax.swing.JProgressBar;
import java.awt.Color;

public class ProgressBar extends JADTComponent {
    private final JProgressBar progressBar;
    int SizeX,sizeY,positionX,positionY;

    public ProgressBar(int value) {
        progressBar = new JProgressBar(value);
        progressBar.setStringPainted(true);
    }
    public void setProgressBarProgress(int progress) {
        progressBar.setValue(progress);
    }
    public void setSize(int SizeX, int sizeY)
    {
        progressBar.setSize(SizeX,sizeY);
        this.SizeX = SizeX;
        this.sizeY = sizeY;
    }
    public void setPosition(int positionX, int positionY)
    {
        progressBar.setBounds(positionX,positionY,SizeX,sizeY);
        this.positionX = positionX;
        this.positionY = positionY;
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
        return sizeY;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public JProgressBar getComponent(){
        return progressBar;
    }
    public void setColor(jadt.graphics.Color color){
        progressBar.setBackground(color);
    }
    public void setTextColor(jadt.graphics.Color color){
        progressBar.setForeground(color);
    }
}