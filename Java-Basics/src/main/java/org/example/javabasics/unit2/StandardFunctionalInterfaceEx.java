package org.example.javabasics.unit2;

import org.example.javabasics.unit1.Condition;
import org.example.javabasics.unit1.Person;
import org.example.javabasics.unit1.PersonsDataSolutionByJava8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StandardFunctionalInterfaceEx {

    public static void main(String[] args) {
        //call persons data
        List<Person> personsList = addPersonsData();
        // sort
        PersonsDataSolutionByJava8 sol=new PersonsDataSolutionByJava8();
        sol.sortPersonsListByComparator(personsList);

        //create 1 method to print all the data
        System.out.println("printing all the data with out condition-->");
        sol.printPersonsData(personsList);
        System.out.println("printing all the data by condition-->");
        sol.printPersonsDataByCondition(personsList,(person)->true);
        //create persons data to print lastname begins with C
        System.out.println("printing all the data which lastname starts with c-->");
        Predicate<Person> predicate = (person) -> person.getLastName().startsWith("C");

        //implemented consumer logic
        //p->System.out.println(p) is nothing but consumer
        sol.printPersonsDataByPredicate(personsList,predicate,p->System.out.println(p));

    }

    //Add Persons data

    public static List<Person> addPersonsData(){
        return Arrays.asList(
                new Person("deepthi","Clakshmi",12),
                new Person("pradeep","Akadati",15),
                new Person("yogesh","Bsri",14),
                new Person("raj","Ckumar",13)

        );
    }


}
