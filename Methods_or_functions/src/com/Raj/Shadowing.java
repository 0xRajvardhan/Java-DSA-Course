package com.Raj;

public class Shadowing {
    static int x = 90; //this will be shadowed at line 8

    public static void main(String[] args) {
        System.out.println(x); //90
        int x; //the class value of line 4 is shadowed here (means overridden)
//        System.out.println(x); this will give an error because it was declared but not initialised (it was shadowed already)
        x = 50;
        System.out.println(x); //40
        fun();

    }

    static void fun() {
        System.out.println(x); //90
    }
}
