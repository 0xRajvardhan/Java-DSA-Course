package com.Raj;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 6, 6); // you can enter any number of arguments(ints)
        learn("hello", "bro", "i", "am", "just", "learning");
        multiple(2, 3, "Java", "is", "beautiful");
    }

    static void fun(int... a) { //this will be taken as array of int
        System.out.println(Arrays.toString(a));
    }

    static void learn(String... x) { //this will be taken as array of int
        System.out.println(Arrays.toString(x));
    }

    static void multiple(int p, int q, String... v) {
        System.out.println(p + " " + q + " " + v);
    }
}
