package com.Raj;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some input: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is: " + rollno);

        int a = 234_000_000; //underscores will get ignored and a comma will get added
        System.out.println(a);
    }
}