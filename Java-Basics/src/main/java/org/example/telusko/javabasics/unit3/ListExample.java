package org.example.telusko.javabasics.unit3;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(13);
        list.add(15);
        list.add(17);
        System.out.println("index val--->"+list.get(2));
        for (int num:list) {
            System.out.println(num);
        }
    }
}
