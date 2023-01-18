package com.Raj;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */
        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][]; // adding rows is mandatory but not rows
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        }; // this is a direct way

        int[][] arr = new int[3][3];
        System.out.println(arr.length); //number of rows
        //input
        for (int row = 0; row < arr.length; row++) {
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        //output
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//            System.out.println();
//        }

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
            System.out.println();
        }
    }
}
