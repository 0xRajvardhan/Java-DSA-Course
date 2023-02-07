package com.Raj;

public class Comparison {
    public static void main(String[] args) {
        String a = "Rajvardhan";
        String b = "Rajvardhan";
        String c = a;
        System.out.println(c == a);


        // == (proof of string pool)
//        System.out.println(a == b);

        //below is the way to create them out of the pool

        String name1 = new String("Rajvardhan");
        String name2 = new String("Rajvardhan");

//        System.out.println(name1 == name2); //this is an comparison operator
        System.out.println(name1.equals(name2)); //this will give true because its only checking the value
        System.out.println(name1.charAt(0));
    }
}
