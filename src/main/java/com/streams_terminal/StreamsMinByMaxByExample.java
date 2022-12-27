package com.streams_terminal;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamsMinByMaxByExample {

    public static Optional<Student> minByExample(){
       return  StudentDataBase.getAllStudents()
                .stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxByExample(){
        return  StudentDataBase.getAllStudents()
                .stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }
    public static void main(String[] args) {
        System.out.println("Min by example " + minByExample());
        System.out.println("Max by example " + maxByExample());
    }
}
