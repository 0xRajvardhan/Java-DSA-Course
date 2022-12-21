package com.Raj;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);
        int num = (int) (67.56f); // This is TypeCasting
        System.out.println(num);

        //Automatic Type Promotions in Expressions
//        int a = 257;
//        byte b = (byte) a; // 257 - 256 = 1

//        Automatic Conversion (type promotion)

        byte a = 40;
        byte b = 50;
        byte c = 100;

        int d = a * b / c;

        System.out.println(d);

        int number = 'A';
        System.out.println(number);

        System.out.println("नमस्ते"); //Java allows unicode value

        System.out.println(2 * 9.9); // type will promote to float in the output

        byte x = 42;
        char y = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double z = 0.1234;

        double result = (f * a) + (i / y) - (z - s);
        //float + int - double = double
        System.out.println((f * a) + " " + (i / y) + " " + (z - s));
        System.out.println(result);
    }
}
