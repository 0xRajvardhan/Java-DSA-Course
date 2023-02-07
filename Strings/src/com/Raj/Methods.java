package com.Raj;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Rajvardhan Singh Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Rajvardhan   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
