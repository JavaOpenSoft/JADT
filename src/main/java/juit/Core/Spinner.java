package juit.Core;

import javax.swing.*;

public class Spinner {
    public  JSpinner jSpinner;
    public Spinner(int initValue, int minimum,int maximum,int interval){
        SpinnerModel value = new SpinnerNumberModel(initValue, minimum, maximum, interval);
        JSpinner jSpinner = new JSpinner();
    }
    int value,minimum,maximum,interval;
    int initValue;
    int PositionX,PositionY,SizeX,SizeY;

    public int getPositionX() {
        return PositionX;
    }
    public  void setSize(int SizeX, int SizeY)
    {
        jSpinner.setSize(SizeX,SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void  setPosition(int PositionX, int PositionY)
    {
        jSpinner.setBounds(PositionX,PositionY,SizeX,SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }

    public int getPositionY() {
        return PositionY;
    }

    public int getSizeX() {
        return SizeX;
    }

    public int getSizeY() {
        return SizeY;
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

    public JSpinner getjSpinner() {
        return jSpinner;
    }
}
