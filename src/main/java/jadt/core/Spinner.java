package jadt.core;

import javax.swing.*;

public class Spinner {
    private JSpinner jSpinner;
    public Spinner(int initValue, int minimum,int maximum,int interval){
        SpinnerModel value = new SpinnerNumberModel(initValue, minimum, maximum, interval);
        JSpinner jSpinner = new JSpinner();
    }
    int value,minimum,maximum,interval;
    int initValue;
    int positionX,positionY,sizeX,sizeY;

    public int getPositionX() {
        return positionX;
    }
    public  void setSize(int sizeX, int sizeY)
    {
        jSpinner.setSize(sizeX,sizeY);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public void  setPosition(int positionX, int positionY)
    {
        jSpinner.setBounds(positionX,positionY,sizeX,sizeY);
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }


    public int getInitValue() {
        return initValue;
    }

    public void setInitValue(int initValue) {
        this.initValue = initValue;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public void setValue(int value)
    {
        jSpinner.setValue(value);
        this.value = value;
    }
    public void addValue(int addValue)
    {
        this.value += addValue;
        jSpinner.setValue(value);

    }
    public int getValue()
    {
        return value;
    }

    public JSpinner getComponent() {
        return jSpinner;
    }
}
