package org.example.telusko.javabasics.unit1;

import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(6,3,7,4,64,56,8,30);
        System.out.println("<-----double teh value---->");
        list.stream().map(val->val*2).forEach(val->System.out.println(val));
        long count = list.stream().count();
        System.out.println("count---->"+count);
        //limit to 2
        System.out.println("<----Limit to 2 values------->");
        list.stream().map(val->val*2).limit(2).forEach(val->System.out.println(val));
        //sorting
        System.out.println("<----Sorted Data------->");
        list.stream().sorted().forEach(val->System.out.println(val));
        System.out.println("<----Sorted Data multiplied by 3------->");
        list.stream().sorted().map(val->val*3).
                forEach(val->System.out.println(val));

    }
}
