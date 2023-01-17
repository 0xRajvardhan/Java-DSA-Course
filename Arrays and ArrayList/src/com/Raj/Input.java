package com.Raj;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 453;
        arr[4] = 3;
        System.out.println(arr[3]);

        // input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        for (int num : arr) { // for every element in the array print the array
//            System.out.println(num); // here num represents element of the array
//        }


        //array of objects
        String[] str = new String[4];
        for (int a = 0; a < str.length; a++) {
            str[a] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
