package org.example.javabasics.unit4;

import org.example.javabasics.unit1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsExample1 {

    public static void main(String[] args) {
        //call persons data
        List<Person> personsList = addPersonsData();
        personsList.stream().forEach(System.out::println);
        personsList.stream().forEach(p->p.getLastName());
        Predicate<Person> predicate = p->p.getLastName().startsWith("C");
        // print by condition
        System.out.println("<----- print by last name starts with c---->");
       personsList.stream().filter(predicate).forEach(System.out::println);
    }

    public static List<Person> addPersonsData(){
        return Arrays.asList(
                new Person("deepthi","Clakshmi",12),
                new Person("pradeep","Akadati",15),
                new Person("yogesh","Bsri",14),
                new Person("raj","Ckumar",13)

        );
    }
}
