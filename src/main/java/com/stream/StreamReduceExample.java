package com.stream;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> intgerList){
        return intgerList.stream()
                //1
                //3//
                //5
                //7
                // a= 1, b= 1 (from stream) =>
                .reduce(1, (a, b) -> a*b);
    }
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,3,5,7);
        System.out.println(performMultiplication(integers));
    }
}
