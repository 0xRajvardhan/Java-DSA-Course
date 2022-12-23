package com.Raj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a fruit name: ");
        String fruit = in.next();
        // instead of IFs we can use SwitchCases
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Apple a day keeps the doctor away");
            case "Orange" -> System.out.println("Sour af");
            case "Grapes" -> System.out.println("Vine fruit");
            default -> System.out.println("Please enter valid fruit");
        }
        System.out.print("Enter a number from 1-7: ");
        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}