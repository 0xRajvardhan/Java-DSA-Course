package com.Raj;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter first number: ");
        num1 = in.nextInt();
        System.out.print("Enter second number: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.print("The sum is: " + sum);
    }

    /*
    return_type name () {
        //body
        return statement
     */
}
