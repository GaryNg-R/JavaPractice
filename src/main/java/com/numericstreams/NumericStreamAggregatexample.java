package com.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregatexample {

    public static void main(String[] args) {
       int sum =  IntStream.rangeClosed(1,50).sum();
        System.out.println("Sum is " + sum);

        OptionalInt max =  IntStream.rangeClosed(1,50).max();
        System.out.println("Max is " + (max.isPresent() ? max.getAsInt() : 0));

        OptionalLong optionLong = LongStream.rangeClosed(50,100).min();

        System.out.println("Min is " + (optionLong.isPresent() ? optionLong.getAsLong() : 0));

        OptionalDouble optionDouble = IntStream.rangeClosed(1,50).average();

        System.out.println("Average is " + (optionDouble.isPresent() ? optionDouble.getAsDouble() : 0));



    }
}
