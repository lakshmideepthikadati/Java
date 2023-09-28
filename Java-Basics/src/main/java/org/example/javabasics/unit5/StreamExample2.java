package org.example.javabasics.unit5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample2 {
    public static void main(String[] args) {

        List<List<Users>> usersList= Arrays.asList(Arrays.asList(new Users("deepthi", "gaddam",1), new Users("pradeep", "kadati",2)));



        IntStream numList = IntStream.of(1, 5, 10, 20, 30);
        //print all lastnames

        //usersList.forEach(user->System.out.println(user.getLastName()));

        //print all first Names which has in numlist
        System.out.println("<----printing second caes values--->");
       // usersList.stream().filter(u->numList.anyMatch(i->i==u.getId())).forEach(user->System.out.println(user.getFirstName()));

        usersList.stream().flatMap(users->users.stream().map(user->user.getId())).collect(Collectors.toList()).forEach(System.out::println);

    }
}
