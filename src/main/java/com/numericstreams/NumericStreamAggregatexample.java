package com.numericstreams;

import java.util.stream.IntStream;

public class NumericStreamAggregatexample {

    public static void main(String[] args) {
       int sum =  IntStream.rangeClosed(1,50).sum();
        System.out.println("Sum is " + sum);

    }
}
