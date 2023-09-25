package org.example.javabasics.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        int[] someNumbers={1,2,3,4};
        int key=0;

        //pass some lambda expression to do some operations
        process(someNumbers,key,wrapperLambda((N,K)->System.out.println(N/K)));

    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
        return (N,K)->{
            try{
               biConsumer.accept(N,K);
            }catch (ArithmeticException exception){
                System.out.println("inside Arithmetic exception");
            }
        } ;
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {

        for (int number:someNumbers) {
            biConsumer.accept(number,key);
        }
    }
}
