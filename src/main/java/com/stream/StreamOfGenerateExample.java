package com.stream;

import java.util.stream.Stream;

public class StreamOfGenerateExample {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("adam","dan","julie");
        stringStream.forEach(System.out::println);
    }
}
