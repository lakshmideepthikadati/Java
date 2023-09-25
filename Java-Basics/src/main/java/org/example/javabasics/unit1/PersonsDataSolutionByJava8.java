package org.example.javabasics.unit1;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonsDataSolutionByJava8 {

    //sort list by lastname
    public void sortPersonsListByComparator(List<Person> personsList) {

        personsList.sort((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
    }

     /*
     * Print persons Data
     */
    public void printPersonsData(List<Person> personsList){

        for (Person person:personsList) {
            System.out.println(person);
        }
    }

    /**
     * Create methhod that print all persons data wchich last name begins with C
     */
    public void printPersonsDataByCondition(List<Person> personsList, Condition condition){

        for (Person person:personsList) {
            if(condition.test(person)){
                System.out.println(person);
            }
        }
    }

    public void printPersonsDataByPredicate(List<Person> personsList, Predicate<Person> predicate,Consumer<Person> consumer) {

        for (Person person:personsList) {
            if(predicate.test(person)){
                consumer.accept(person);
            }
        }
    }
}
