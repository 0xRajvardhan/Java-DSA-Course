package com.Raj;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
        Syntax of for loops -

        for(initialisation; condition; increment/decrement) {
        //body
        }
         */

        //Q: Print numbers from 1 to 5
        for (int num = 1; num <= 5; num ++){
            System.out.println(num);
        }

        //Q: Print numbers from 1 to n
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        for (int num = 1; num <= n; num++ ) {
//            System.out.println(num);
            System.out.println("I will complete my homework");
        }

    }
}
