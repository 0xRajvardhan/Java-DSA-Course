package com.Raj;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
        int ans = sum2();
        System.out.println(ans);
    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter first number: ");
        num1 = in.nextInt();
        System.out.print("Enter second number: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum; //this function is over here if you put anything after this return statement it will never get executed.
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter first number: ");
        num1 = in.nextInt();
        System.out.print("Enter second number: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }

    /*
    return_type name (arguments) {
        //body
        return statement
     */
}
