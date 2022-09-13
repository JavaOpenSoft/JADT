package jadt.templates.clock;

public class Time extends java.util.Date{
    public String getCurrentTime()
    {
        return String.valueOf(java.time.LocalTime.now());
    }
    public void printCurrentTime()
    {
        System.out.println(java.time.LocalTime.now());
    }
}
