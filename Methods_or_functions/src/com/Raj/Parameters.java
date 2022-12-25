package com.Raj;

import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {
        //pass the value of numbers when you are calling the method in main
//        int ans = sum3(1, 2);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Your answer: " + sum3(20, 30));
        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    private static String myGreet(String name) {
        String message = "Well done buddy " + name ;
        return message;
    }

    static int sum3(int a, int b) {
    // int sum = a + b;
    // return sum;
        return a + b;
    }
}
