package org.example;

import Auto.Day13;

public class D13 {

    static void info()
    {
        System.out.println("The sun rises in the east");
    }

    static String Fruit= "Apple";

    void info2()
    {
        System.out.println("Non static method");
    }
    String Fruit2 = "Orange";





    public static void main(String[] args) {

        System.out.println();

        Day13.static_method();
        System.out.println("The value of pi is " + Day13.pi + ". The value of pi is a static variable.");

        System.out.println();

        info();
        System.out.println("An " + Fruit + " a day keeps the doctor away.");


        // A non-static variable and method cannot be accessed inside a static method
//         System.out.println(Fruit2);
//         info2();
    }

    static
    {
        System.out.println("Hi I am static block. I will be run first even when I am declared below the main method.");
    }
}
