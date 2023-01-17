package com.Raj;

public class Main {
    public static void main(String[] args) {
        //Q: Store a role number
        int a = 90;
        //Q: Store a person's name
        String name = "Rajvardhan";

        //syntax of array
        // datatype[] variable_name = new datatype[size];

        //Q: Store 5 roll numbers
//        int[] roll = new int[5];
//        // or directly
//        int[] rollno = {23, 34, 45, 56, 14};

        int[] rollno; //declaration of array. rollno is getting defined in tha stack memory
        rollno = new int[5]; //initialisation: actually here object is being created in the heap memory
        System.out.println(rollno[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);
    }
}