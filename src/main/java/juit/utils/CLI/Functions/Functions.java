package juit.utils.CLI.Functions;

public class Functions {

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
        String temp = String.valueOf(bool);
        return str1.equals(temp);
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
        return  str1+""+str2;
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
