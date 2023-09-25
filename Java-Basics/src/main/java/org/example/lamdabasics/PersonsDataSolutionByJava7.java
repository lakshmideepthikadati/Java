package org.example.lamdabasics;

import java.util.Comparator;
import java.util.List;

public class PersonsDataSolutionByJava7 {

    //sort list by lastname
   public void sortPersonsListByComparator(List<Person> personsList){
       personsList.sort(new Comparator<Person>() {
           @Override
           public int compare(Person o1, Person o2) {
               return o1.getLastName().compareTo(o2.getLastName());
           }
       });
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
    public void printPersonsDataByCondition(List<Person> personsList,Condition condition){

        for (Person person:personsList) {
            if(condition.test(person)){
                System.out.println(person);
            }
        }
    }
}
