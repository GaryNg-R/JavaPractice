package com.streams_terminal;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class StreamsJoiningExample {

    public static String joining_1(){
       return StudentDataBase.getAllStudents().stream()
                .map(Student::getName) //<Stream><String>>
                .collect(joining());
    }

    public static String joining_2(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName) //<Stream><String>>
                .collect(joining("-"));
    }

    public static String joining_3(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName) //<Stream><String>>
                .collect(joining("-","(",")ß"));
    }

    public static void main(String[] args) {
        System.out.println("Joining 1 :" + joining_1());
        System.out.println("Joining 2 :" + joining_2());
        System.out.println("Joining 3 :" + joining_3());
    }
}
