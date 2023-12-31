package org.example.javabasics.unit1;

import java.util.Arrays;
import java.util.List;

public class Unit1ExerciseSolutionByJava7 {

    public static void main(String[] args) {
        //call persons data
        List<Person> personsList = addPersonsData();
        // sort
        PersonsDataSolutionByJava7 sol=new PersonsDataSolutionByJava7();
        sol.sortPersonsListByComparator(personsList);

        //create 1 method to print all the data

        sol.printPersonsData(personsList);
        //create persons data to print lastname begins with C
        Condition condition =  new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("C");
            }
        };
        sol.printPersonsDataByCondition(personsList,condition);

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
