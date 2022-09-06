package juit.utils.Clock;


import java.awt.Component;
public class Clock {
    String type = "";
    public Component getDigitalClock()
    {
        type = "Digital";
        return new DigitalClock();

    }
    public AnalogClock getAnalogClock()
    {
        type = "Analog";
        return new AnalogClock();
    }
    public String getClockType()
    {
        return type;
    }
}

