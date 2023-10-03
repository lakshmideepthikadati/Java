package org.example.telusko.javabasics.unit3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(62);
        set.add(52);
        set.add(42);
        set.add(42);
        set.add(62);
        set.add(2);

        System.out.println(set);
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(62);
        treeSet.add(52);
        treeSet.add(42);
        treeSet.add(42);
        treeSet.add(62);
        treeSet.add(2);

        System.out.println(treeSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(6);
        linkedHashSet.add(7);
        linkedHashSet.add(8);
        linkedHashSet.add(9);
        linkedHashSet.add(2);

        System.out.println(linkedHashSet);





    }
}
