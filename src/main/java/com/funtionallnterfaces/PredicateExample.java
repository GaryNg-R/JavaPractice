package com.funtionallnterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p = (i)->{ return i%2 == 0;};

    //remove { } no need return
    static Predicate<Integer> p1 = (i)-> i%2 == 0;
    static Predicate<Integer> p2 = (i)-> i%5 == 0;;

    public  static void predicateAnd(int num){
        System.out.println(p1.and(p2).test(num));
    }

    public  static void predicateOr(int num){
        System.out.println(p1.or(p2).test(num));
    }

    public  static void predicateNegate(int num){
        System.out.println(p1.or(p2).negate().test(num));
    }
    public static void main(String[] args) {

        //System.out.println(p.test(4));

        predicateAnd(10);
        predicateOr(8);
        predicateNegate(8);

    }
}
