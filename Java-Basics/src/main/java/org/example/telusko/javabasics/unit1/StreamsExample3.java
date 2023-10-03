package org.example.telusko.javabasics.unit1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,3,7,4,64,56,8,30);
        System.out.println("<-----print the values---->");

       // list.forEach(i -> System.out.println(i));

       // list.stream().forEach(n->System.out.println(n));

        //double of even numbers

      list.stream().filter(n->n%2==0).map(n->n*2).forEach(n->System.out.println(n));

       //sum of double of even numbers

        int sum =list.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(c,e)->c+e).intValue();
        System.out.println("sum--->"+sum);

        //sorting
        list.stream().filter(n->n%2==0).sorted().forEach(n->System.out.println(n));

        //multiple threads
        list.parallelStream().filter(n->n%2==0).sorted().forEach(n->System.out.println(n));
    }


}
