package org.example.telusko.javabasics.unit12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithEx {

    public static void main(String[] args) throws IOException {


        try(BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));){
            System.out.println("Please Enter The Value");
            int num=Integer.parseInt(reader.readLine());
            System.out.println(num);
        }

    }
}
