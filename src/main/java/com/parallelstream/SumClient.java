package com.parallelstream;

import java.util.stream.IntStream;

public class SumClient {
    public static void main(String[] args) {
        Sum sum = new Sum();
        IntStream.rangeClosed(1,1000)
                .parallel()
                //1,2,3...1000
                .forEach(sum::performSum);
        System.out.println(sum.getTotal());

        //get different result because updating sum.total and cause sync problem
        //should not use parallel

    }
}
