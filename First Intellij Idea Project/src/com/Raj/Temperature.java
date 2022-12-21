package com.Raj;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter temperature in celcius: ");

        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;

        System.out.println("Your temperature in Fahrenheit is: " + tempF);

    }
}
