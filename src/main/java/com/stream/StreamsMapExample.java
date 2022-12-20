package com.stream;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> nameList(){
        return StudentDataBase.getAllStudents().stream() //output Stream<Student>
                //Student as an input -> Student Name
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase) //Stream<String> -> uppercase operation on each input
                .collect(Collectors.toList()); //List<String>
    }

    public static Set<String> nameSet(){
        return StudentDataBase.getAllStudents().stream() //output Stream<Student>
                //Student as an input -> Student Name
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase) //Stream<String> -> uppercase operation on each input
                .collect(Collectors.toSet()); //Set<String>

    }

    public static void main(String[] args) {
        System.out.println(nameList());
        System.out.println(nameSet());
    }
}
