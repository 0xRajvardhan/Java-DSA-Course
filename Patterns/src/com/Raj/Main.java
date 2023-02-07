package com.Raj;

public class Main {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n + 1; row++) {
            // for every row, run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // When one row is printed, we need to add a newline
            System.out.println();
        }
        System.out.println();
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // When one row is printed, we need to add a newline
            System.out.println();
        }
        System.out.println();
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            // When one row is printed, we need to add a newline
            System.out.println();
        }
        System.out.println();
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            // When one row is printed, we need to add a newline
            System.out.println();
        }
        System.out.println();
    }

    static void pattern5(int n) {
        for (int row = 0; row < n * 2; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern6(int n) {
        for (int row = 0; row < n * 2; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}