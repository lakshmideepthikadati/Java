package org.example.javabasics.unit3;

import org.example.javabasics.unit1.Condition;
import org.example.javabasics.unit1.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class CollectionInterfaceExample {

    public static void main(String[] args) {

        //call persons data
        List<Person> personsList = addPersonsData();
        /*
       for (Person person : personsList) {
            System.out.println(person);
        }*/
        personsList.sort((o1,o2)-> o1.getLastName().compareTo(o2.getLastName()));
        //print data by using for each
        printData(personsList);

    }
    private static void printData(List<Person> personsList) {
        personsList.forEach((person)->System.out.println(person));
        personsList.forEach(System.out::println);
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
