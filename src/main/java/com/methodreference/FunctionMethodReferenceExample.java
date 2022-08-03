package com.methodreference;

import java.util.Locale;
import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String,String> toUpperCaseLmabda = s -> s.toUpperCase();

    static Function<String,String> toUpperMethodReference = String::toUpperCase;
    public static void main(String[] args) {

        System.out.println(toUpperCaseLmabda.apply("java8"));
        System.out.println(toUpperMethodReference.apply("java8"));
    }
}
