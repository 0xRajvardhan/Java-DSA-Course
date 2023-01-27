package com.Raj;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10
        );
        list.add(67);
        list.add(34);
        list.add(32);
        list.add(5678);
        list.add(756);
        list.add(567);


//        System.out.println(list.contains(654));
        System.out.println(list);
        list.set(0, 100); // sets 100 at 0th index
        list.remove(2);
        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //pass index here, list[index] syntax will not work here
        }

    }
}
