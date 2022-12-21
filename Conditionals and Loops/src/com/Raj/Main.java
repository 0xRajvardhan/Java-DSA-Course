package com.Raj;

public class Main {
    public static void main(String[] args) {
        /*
            Syntax of is statements:
            if (boolean expression T or F) {
                //body
            } else {
                // do this
         */
        int salary = 25400;
        if (salary > 10000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }

        System.out.println(salary);

//        Multiple if else
        int salary2 = 25000;
        if (salary2 > 10000) {
            salary2 += 2000; // salary2 = salary2 + 2000
        } else if (salary2 > 20000) {
            salary2 += 3000;
        } else {
            salary2 += 1000;
        }

        System.out.println(salary2);
    }
}