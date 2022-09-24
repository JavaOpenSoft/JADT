package jadt.utils.cli;

import java.io.IOException;

public class Console extends Functions{
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
class Functions extends Math{

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
    public char ExtractCharacterFromString(String str,char extractChar)
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

    public char[] ConvertStringToCharacterArray(String str)
    {
        return str.toCharArray();
    }
    public String removeExtraSpaces(String str)
    {
        return str.trim();
    }
    public static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }
    public int toInt(float value){
        return Integer.parseInt(String.valueOf(value));
    }

}
class Math {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2)
    {
        return num1*num2;
    }
    public int divide(int num1,int num2)
    {
        return num1/num2;
    }
    public int square(int num){
        return num*num;
    }
    public float sqrt(int num){
        return (float) java.lang.Math.sqrt(num);
    }
    public int cube(int num){
        return num*num*num;
    }
    public int power(int num, short power){
        int temp = num;
        for(int i=0; i<power; i++)temp*=num;
        return temp;
    }
    public float cbrt(int num){
        return (float) java.lang.Math.cbrt(num);
    }
    public int root(int num, int root){
        return (int) java.lang.Math.round(java.lang.Math.pow(125, (float)1 / root));
    }

}
