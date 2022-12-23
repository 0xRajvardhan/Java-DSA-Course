package com.Raj;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter empID: ");
        int empID = in.nextInt();
        System.out.print("Enter Department ");
        String department = in.next();

        //better way to write
        switch (empID) {
            case 1 -> System.out.println("Kunal");
            case 2 -> System.out.println("Raj");
            case 3 -> {
                System.out.println("Employee number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("Berozgar");
                }
            }
            default -> System.out.println("Enter correct empID");
        }
    }
}
