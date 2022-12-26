package com.streams_terminal;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumAvgExample {

    public static int sum(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getNoteBooks));
    }


    public static double avg(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingInt(Student::getNoteBooks));
    }
    public static void main(String[] args) {
        System.out.println("sum of notebooks " + sum());
        System.out.println("avg of notebooks " + avg());

    }
}
