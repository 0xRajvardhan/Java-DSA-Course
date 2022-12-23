package com.Raj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        // instead of IFs we can use SwitchCases
        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("Apple a day keeps the doctor away");
                break;
            case "Orange":
                System.out.println("Sour af");
                break;
            case "Grapes":
                System.out.println("Vine fruit");
                break;
            default:
                System.out.println("Please enter valid fruit");
        }
    }
}