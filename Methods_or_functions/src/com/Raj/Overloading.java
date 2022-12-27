package com.Raj;

public class Overloading {
    public static void main(String[] args) {
        fun("Rajvardhan");
        fun(60);
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }

}
