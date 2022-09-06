package juit.utils.CLI.Functions;

public class Math {
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
