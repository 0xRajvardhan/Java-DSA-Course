package com.Raj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        if (fruit.equals("mango")) {
            System.out.println("King of fruits");
        }

        if (fruit.equals("apple")) {
            System.out.println("Apple a day keeps the doctor away");

        }
    }
}