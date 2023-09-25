package org.example.javabasics.unit1;

import java.util.Arrays;
import java.util.List;

public class Unit1ExerciseSolutionByJava8 {

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
        Condition condition = (person) -> person.getLastName().startsWith("C");
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
