package com.streams_terminal;

import com.data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class StreamsCountingExample {

    public static long count(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student ->  student.getGpa() >= 3.5)
                .collect(counting());
    }
    public static void main(String[] args) {
        System.out.println("Count " +count());
    }
}
