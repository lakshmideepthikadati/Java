package org.example.telsuko.unit1;

import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(6,3,7,4);
        System.out.println("<-----print odd numbers--->");
        list.stream().filter(val->val%2==1).forEach(val->System.out.println(val));
        System.out.println("<-----print even numbers--->");
        list.stream().filter(val->val%2==0).forEach(val->System.out.println(val));

        //use reduce to sum the values
        int sum = list.stream().filter(val->val%2==0).reduce(0,(a,b)->a+b);
        System.out.println("sum--->"+sum);
        //use reduce to mul the values
        int mul = list.stream().filter(val->val%2==0).reduce(1,(a,b)->a*b);
        System.out.println("mul--->"+mul);

    }
}
