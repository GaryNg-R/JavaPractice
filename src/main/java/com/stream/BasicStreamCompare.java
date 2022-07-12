package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class BasicStreamCompare {

    public static void main(String[] args) {

        // sum of integers for the range from 0 to 100
        /**
         * Imperative Style - how style of programming
         */
        int sum=0;
        for(int i=0;i<=100;i++){
            sum+=i; // shared mutable state and its sequential anf it will go step by step
            // and it will have issues if we try to run the code in multithreaded environment
        }
        System.out.println("Sum is : "+sum);


        /**
         * Declarative style. (Functional programming uses the same style)
         * what style of programming.
         * You let the system do the job for you and get the result.
         */
        int sum1= IntStream.rangeClosed(0,100)
                //.parallel()
                .map(Integer::new)
                .sum();

        System.out.println("sum1 : " + sum1);



        List<Integer> integerList = Arrays.asList(1,2,3,4,4,5,5,6,7,7,8,9,9);

        //Remove the duplicates from the list.

        /**
         * Imperative Style
         */
        List<Integer> uniqueList = new ArrayList<>();
        for(Integer i :integerList)
            if(!uniqueList.contains(i)){
                uniqueList.add(i);
            }
        System.out.println("unique List : " + uniqueList);

        /**
         * Declarative Syle
         */

        List<Integer> uniqueList1 = integerList.stream()
                .distinct()
                .collect(toList());
        System.out.println("uniqueList1 : " + uniqueList1);

    }
}
