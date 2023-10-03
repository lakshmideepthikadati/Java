package coom.example.telusko.javabasics.unit2;

import java.util.*;

public class SortExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(35);
        list.add(57);
        list.add(32);


        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list,(Integer i, Integer j) ->{

            if(i%10 > j%10){
                return 1;
            }else{
                return -1;
            }
            });
        System.out.println(list);
    }
}
