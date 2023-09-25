package org.example.lamdabasics;

import java.util.Arrays;
import java.util.List;

public class Unit1ExerciseSolutionByJava7 {

    public static void main(String[] args) {
        //call persons data
        List<Person> personsList = addPersonsData();
        // sort
        PersonsDataSolution sol=new PersonsDataSolution();
        sol.sortPersonsListByComparator(personsList);

        //create 1 method to print all the data

        sol.printPersonsData(personsList);
        //create persons data to print lastname begins with C
        sol.printPersonsDataByLastNameBeginsWithC(personsList);

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
