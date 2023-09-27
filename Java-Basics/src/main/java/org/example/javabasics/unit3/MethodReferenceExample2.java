package org.example.javabasics.unit3;

import org.example.javabasics.unit1.Condition;
import org.example.javabasics.unit1.Person;
import org.example.javabasics.unit1.PersonsDataSolutionByJava8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    public static void main(String[] args) {
        //call persons data
        List<Person> personsList = addPersonsData();
        // sort
        PersonsDataSolutionByJava8 sol=new PersonsDataSolutionByJava8();
        sol.sortPersonsListByComparator(personsList);

        //create 1 method to print all the data
        System.out.println("printing all the data with out condition-->");
        sol.printPersonsDataByPredicate(personsList,(person)->true,(person)->System.out.println(person));
        System.out.println("<------- printing all the data by condition------->");
        Predicate<Person> predicate = (person)->person.getLastName().startsWith("C");
        sol.printPersonsDataByPredicate(personsList,predicate,(person)->System.out.println(person));
        //By Method Reference
        System.out.println("<------- printing all the data by condition with method reference------->");
        sol.printPersonsDataByPredicate(personsList,predicate,System.out::println);  // p->method(p)


    }

    public void printPersonsDataByPredicate(List<Person> personsList, Predicate<Person> predicate, Consumer<Person> consumer) {

        for (Person person:personsList) {
            if(predicate.test(person)){
                consumer.accept(person);
            }
        }
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
