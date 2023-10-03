package org.example.telusko.javabasics.unit3;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap();
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);

        System.out.println(map);

        for (Map.Entry<String,Integer> entrySet:map.entrySet()) {

            System.out.println("Key--->"+entrySet.getKey()+",Value---->"+entrySet.getValue());
        }
    }


}
