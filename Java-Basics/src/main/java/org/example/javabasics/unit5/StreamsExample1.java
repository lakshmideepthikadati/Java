package org.example.javabasics.unit5;

import javax.xml.transform.stream.StreamSource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamsExample1 {
    public static void main(String[] args) {

        //print all numbers less than  or equal to 10
        IntStream multipleValeus = IntStream.of(1, 5, 10, 20, 30);
        multipleValeus.filter(n->n<=10).forEach(System.out::println);
        multipleValeus.close();
        System.out.println("<---print only 2 numbers--->");
        //print 2nd &3rd numbers less than  or equal to 10
         multipleValeus = IntStream.of(1, 5, 10, 20, 30);

        multipleValeus.filter(n->n<=10)
                    .skip(1)
                            .limit(2)
                                .forEach(System.out::println);
        multipleValeus.close();

        //print 1st number in stream greater than 5, if nothing is found print -1

        multipleValeus = IntStream.of(1, 5, 6,3,8);
        System.out.println("<---print greater than 5, if nothing is found print -1--->");
        int val = multipleValeus.filter(n->n>10).findFirst().orElse(-1);
        System.out.println(val);
    }
}
