package com.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {
        //isPresent
        Optional<String> optional = Optional.ofNullable("hello");
        System.out.println(optional.isPresent());
        if(optional.isPresent()){
            System.out.println(optional.get());
        }
        //ifPresent
        optional.ifPresent(s -> System.out.println("if present : " + s));
        //System.out.println(optional.ifPresent());


        int[] a = new int[2];
        System.out.println(a.length);



    }
}
