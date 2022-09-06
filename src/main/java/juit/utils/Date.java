package juit.utils;

import juit.utils.Clock.Time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Date extends Time {
    java.util.Date date = new java.util.Date();
    public String getDate()
    {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        return formatter.format(date);
    }
    public void printDate()
    {
        System.out.println(getDate());
    }
    public void print(int index){
        System.out.println(index);
    }
    public void print(String str){
        System.out.println(str);
    }
    public String getDay(){
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
    public String getMonth(){
        return LocalDate.now().getMonth().name();
    }
    public int getMonthInteger(){
        return LocalDate.now().getMonth().getValue();
    }
    public int getYear(){
        return LocalDate.now().getYear();
    }
}
