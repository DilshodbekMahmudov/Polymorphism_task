package com.lesson.polymorphism;

public class MathFunctions {


    public static int add(int a,int b){
        return a+b;

    }
    public static int sub(int a,int b){
        return a-b;
    }

   public static int multiply(int a,int b){
        return a*b;
    }

   public static double div(double a,double b){
        return a/b;

    }

    public static int abs(int a){
        return Math.abs(a);
    }

    public static double pow(double a){
       return Math.pow(a,2);
    }

    public static void main(String[] args) {

        MathFunctions mathFunctions = new MathFunctions();

        System.out.println(mathFunctions.add(3,5));
        System.out.println(mathFunctions.sub(7,5));
        System.out.println(mathFunctions.multiply(2,5));
        System.out.println(mathFunctions.div(10.5,3.5));
        System.out.println(mathFunctions.abs(-3));
        System.out.println(mathFunctions.pow(5));
    }

}
