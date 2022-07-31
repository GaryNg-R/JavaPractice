package com.funtionallnterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BindaryOperatorExample {

    static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);

    public static void main(String[] args) {
        BinaryOperator<Integer> bindaryOperator = (a, b) -> a+b;

        System.out.println(bindaryOperator.apply(1,2));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("Result of MaxBy is : " + maxBy.apply(4,5));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("Result of MaxBy is : " + minBy.apply(4,5));
    }
}
