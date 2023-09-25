package org.example.lamdabasics;

import java.util.Arrays;
import java.util.List;

public class Unit1ExerciseSolution {

    public static void main(String[] args) {
        //call persons data
        List<Person> personsList = addPersonsData();
        // sort
        PersonsDataSolution sol=new PersonsDataSolution();
       // sol.sortPersonsListByComparator(personsList);
        //System.out.println(personsList);

        sol.sortPersonsListByLambda(personsList);
        System.out.println(personsList);
    }

    //Add Persons data

    public static List<Person> addPersonsData(){
    return Arrays.asList(
                new Person("deepthi","Dlakshmi",12),
                new Person("pradeep","Akadati",15),
                new Person("yogesh","Bsri",14),
                new Person("raj","Ckumar",13)

        );
    }


}
