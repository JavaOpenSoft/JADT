package jadt.templates.clock;


import java.awt.*;
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

