package com.parallelstream;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ParallelStreamBoxedExample {


    public static int sequentialSum(List<Integer> integerList){
        long startTime = System.currentTimeMillis();
        int sum = integerList
                .stream()
                .reduce(0, (x,y) -> x+y);
        long duration = System.currentTimeMillis()-startTime;
        System.out.println("Sequential Duration :" + duration);
        return sum;
    }

    public static int parallelSum(List<Integer> integerList){
        long startTime = System.currentTimeMillis();
        int sum = integerList
                .stream()
                .parallel()
                .reduce(0, (x,y) -> x+y);  ///perform the unboxing from Integer to int
        long duration = System.currentTimeMillis()-startTime;
        System.out.println("Parallel Duration :"  + duration);
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1,10000)
                .boxed()
                .collect(toList());
        sequentialSum(integerList);
        parallelSum(integerList);
    }
}
