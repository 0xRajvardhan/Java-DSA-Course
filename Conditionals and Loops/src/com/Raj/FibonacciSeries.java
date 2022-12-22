package com.Raj;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Q: Find the nth Fibonacci number
        int n = in.nextInt();
        int x = 0;
        int y = 1;
        int count = 2;

        while (count <= n) {
            int temp = y;
            y = y + x;
            x = temp;
            count ++;
        }
        System.out.println(y);
    }
}
