package com.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

    public static List<Integer> mapToObject(){
        return IntStream.rangeClosed(1,5)
                .mapToObj((i) -> {
                    return new Integer(i);
                }).collect(Collectors.toList());
    }

    public static long mapToLong(){
            return IntStream.rangeClosed(1,5)
                    .mapToLong( i -> i ) //convert int stream to long stream
                    .sum();
    }

    public static double mapToDouble(){
        return IntStream.rangeClosed(1,5)
                .mapToDouble( i -> i ) //convert int stream to double stream
                .sum();
    }


    public static void main(String[] args) {
        System.out.println("map to Object " + mapToObject());
        System.out.println("map to long " + mapToLong());
        System.out.println("map to double " + mapToDouble());
    }




}
