package com.example.telusko.javabasics.unit1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputExample {

    public static void main(String[] args) throws IOException {
      /*  System.out.println("Please enter data");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       /// while (reader.ready()){
            System.out.println(reader.readLine());
       // }*/
        System.out.println("Please enter data");
        Scanner scan=new Scanner(System.in);
        System.out.println(scan.nextInt());
    }

}

