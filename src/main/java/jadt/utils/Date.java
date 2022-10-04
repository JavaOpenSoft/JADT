package jadt.utils;

import jadt.templates.clock.Time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Date extends Time{
    private final java.util.Date date = new java.util.Date();
    public String getCurrentDate()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        return formatter.format(date);
    }
    public void printCurrentDate()
    {
        System.out.println(getCurrentDate());
    }
    public void print(int index){
        System.out.println(index);
    }
    public void print(String str){
        System.out.println(str);
    }
    public String getCurrentDay(){
        return LocalDate.now().getDayOfWeek().name();
    }
    public int getDayOfWeek(){
        return LocalDate.now().getDayOfWeek().getValue();
    }
    public int getDayOfMonth(){
        return LocalDate.now().getDayOfMonth();
    }
    public int getDayOfYear(){
        return LocalDate.now().getDayOfYear();
    }
    public int getDayOfDecade(){
        return LocalDate.now().getDayOfYear()*10;
    }
    public int getDayOfCentury(){
        return getDayOfDecade()*10;
    }
    public String getCurrentMonth(){
        return LocalDate.now().getMonth().name();
    }
    public int getMonthInteger(){
        return LocalDate.now().getMonth().getValue();
    }
    public int getCurrentYear(){
        return LocalDate.now().getYear();
    }

}
