package com.stream;

import java.util.Arrays;
import java.util.List;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> integerList){
        return integerList.stream()
                //6 ->y
                //7 ->y
                //8
                //9...
                //x variable hold the max value for each element in the iteration
                .reduce(0,(x,y) -> x>y ? x:y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        int maxValue = findMaxValue(integerList);
        System.out.println("Max value is : " + maxValue);
    }
}
