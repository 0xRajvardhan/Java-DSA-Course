package com.Raj;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + " " + b);

        // swap values
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a, b);
        System.out.println(a + " " + b);

        String name = "Rajvardhan Singh";
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String name) {
        name = "Kunal Kushwaha";
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
