package com.lambda;

import java.util.function.Consumer;

public class LambdaVariable {

    public static void main(String[] args) {
        int i = 0;

        //cannot use (i) since it is local var
        Consumer<Integer> c1 = (i1) ->{
            //also not allow
            //int i = 2;

            System.out.println("value of is " + i1);
        };


            int value = 4; //local var

        Consumer<Integer> c2 = (c) ->{
            System.out.println(value+1);
        };

        c2.accept(4);



    }
}
