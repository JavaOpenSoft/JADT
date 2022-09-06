package juit.utils.Clock;

public class Time {
    public String getTime()
    {
        return String.valueOf(java.time.LocalTime.now());
    }
    public void printTime()
    {
        System.out.println(java.time.LocalTime.now());
    }
}
