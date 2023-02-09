package com.Raj;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        if (n > 5) { //this is a base condition in recursion
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
// base condition in recursion is a condition
// where our recursion will stop making new calls