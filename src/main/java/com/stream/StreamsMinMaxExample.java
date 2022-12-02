package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> integerList){
        return integerList.stream()
                //6 ->y
                //7 ->y
                //8
                //9...
                //x variable hold the max value for each element in the iteration
                .reduce(0,(x,y) -> x>y ? x:y);
                //should not 0 as default value
    }


    public static int findMinValue(List<Integer> integerList){
        return integerList.stream()
                //6 ->y
                //7 ->y
                //8
                //9...
                //x variable hold the min value for each element in the iteration
                .reduce(0,(x,y) -> x<y ? x:y);
        //should not 0 as default value
    }


    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList){
        return integerList.stream()
                //6 ->y
                //7 ->y
                //8
                //9...
                //x variable hold the max value for each element in the iteration
                .reduce((x,y) -> x>y ? x:y);
        //should not 0 as default value use Optional
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList){
        return integerList.stream()

                //6 ->y
                //7 ->y
                //8
                //9...
                //x variable hold the min value for each element in the iteration
                .reduce((x,y) -> x<y ? x:y);
        //should not 0 as default value use Optional
    }


    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
//        int maxValue = findMaxValue(integerList);
//        System.out.println("Max value is : " + maxValue);
//
//        List<Integer> integerListOptional = Arrays.asList();
//        Optional<Integer> maxValueOptional = findMaxValueOptional(integerListOptional);
//        if(maxValueOptional.isPresent()){
//            System.out.println("MaxVaUle using optional :" + maxValueOptional.get());
//        }else{
//            System.out.println("Input list is empty");
//        }

    }
}
