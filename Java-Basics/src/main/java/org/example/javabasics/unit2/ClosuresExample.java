package org.example.javabasics.unit2;

import java.util.function.Consumer;

public class ClosuresExample {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        doProcess(a,i->System.out.println(i+b));


    }

    private static void doProcess(int a, Consumer<Integer> consumer) {
        consumer.accept(a);
    }
}
