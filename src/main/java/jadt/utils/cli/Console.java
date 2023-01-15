package jadt.utils.cli;

import java.io.IOException;

public class Console{
    public static Functions mathFunctions = new Functions();
    public static final String RESET_TEXT_COLOR = "\u001B[0m";
    public static final String BLACK_TEXT = "\u001B[30m";
    public static final String RED_TEXT = "\u001B[31m";
    public static final String GREEN_TEXT = "\u001B[32m";
    public static final String YELLOW_TEXT = "\u001B[33m";
    public static final String BLUE_TEXT = "\u001B[34m";
    public static final String PURPLE_TEXT = "\u001B[35m";
    public static final String CYAN_TEXT = "\u001B[36m";
    public static final String WHITE_TEXT = "\u001B[37m";
    public static final String BLACK_BACKGROUND = "\u001B[40m";
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND = "\u001B[44m";
    public static final String PURPLE_BACKGROUND = "\u001B[45m";
    public static final String CYAN_BACKGROUND = "\u001B[46m";
    public static final String WHITE_BACKGROUND = "\u001B[47m";


    private static final Runtime console = Runtime.getRuntime();

    public Runtime getRuntime() {
        return console;
    }
    public static void wget(String url) throws IOException {
        console.exec("wget "+url);
    }
    public static void wget(String url, String args)throws IOException {
        console.exec("wget "+args+" "+url);
    }
    public static void wget(String url, String args, String outputFileName)throws IOException {
        console.exec("wget "+args+" "+url+" "+outputFileName);
    }
    public static void run(String command) throws IOException {
        console.exec(command);
    }
    public void getShellName(){}
    public void setShell(String shell){

    }
    public void print(String message){
        System.out.println(message);
    }

}
class Functions{

    public boolean equals(String str1,String str2)
    {
        return str1.equals(str2);
    }
    public boolean equals(int num1,int num2)
    {
        return num1 == num2;
    }
    public boolean equals(short num1,short num2)
    {
        return num1 == num2;
    }
    public boolean equals(byte num1,byte num2)
    {
        return num1 == num2;
    }
    public boolean equals(String str1,boolean bool)
    {
        return str1.equals(String.valueOf(bool));
    }
    public boolean equals(boolean bool1,boolean bool2)
    {
        return bool1 == bool2;
    }
    public boolean equals(char c1,char c2)
    {
        return c1 == c2;
    }
    public String concat(String str1,String str2)
    {
        return  str1+" "+str2;
    }
    public String concatWithoutSpace(String str1,String str2)
    {
        return str1+str2;
    }
    public String concatSameString(String str)
    {
        return str+str;
    }
    public char extractCharacterFromString(String str,char extractChar)
    {
        char ch = 0;
        char [] c = str.toCharArray();
        for(int i =0;i< c.length-1;i++)
        {
            if(c[i] == extractChar)
            {
                ch = c[i];
                break;
            }
        }
        return ch;
    }
    public static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }
    public int toInt(float value){
        return Integer.parseInt(String.valueOf(value));
    }

}

