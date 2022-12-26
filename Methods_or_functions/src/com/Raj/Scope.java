package com.Raj;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + " " + b);
        String name = "Rajvardhan";
        {
//            int a = 78; already initialised outside the block in the same method hence you can only change the value not initialise it again
            a = 78; // re-assigned the value
            int c = 90; //values initialised in this block will remain in the block only
            name = "Kunal";
        }
        System.out.println(name);
        System.out.println(a);
//        System.out.println(c); thi will throw an error because of block scope
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
    }

}
