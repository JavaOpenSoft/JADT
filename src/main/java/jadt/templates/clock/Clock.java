package jadt.templates.clock;


import java.awt.*;
import java.util.Objects;

public class Clock {
    public static final String DIGITAL = "Digital";
    public static final String ANALOG = "Analog";
    private String type;
    public Clock(String type) {
        this.type = type;
    }
    public DigitalClock getDigitalClock()
    {
        type = "Digital";
        return new DigitalClock();

    }
    public AnalogClock getAnalogClock()
    {
        type = "Analog";
        return new AnalogClock();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clock clock)) return false;
        return Objects.equals(type, clock.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "Clock{" +
                "type='" + type + '\'' +
                '}';
    }
    public Object getClock(){
        if(type.equals("Digital")) return new DigitalClock();
        else return new AnalogClock();
    }
    public String getClockType()
    {
        return type;
    }
}

