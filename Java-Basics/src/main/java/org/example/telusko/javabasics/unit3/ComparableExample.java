package org.example.telusko.javabasics.unit3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("deepthi",32));
        list.add(new Student("raj",53));
        list.add(new Student("gopal",24));


        Collections.sort(list);
        System.out.println(list);
    }
}
