package com.streams_terminal;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamsMappingExample {


    public static void main(String[] args) {
        List<String> nameList =  StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, toList()));
        System.out.println("name list = " +nameList);


        Set<String> nameSet =  StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, toSet()));

        System.out.println("name set = " + nameSet);

        List<String> nameMapping = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(toList());

        System.out.println("name map = " + nameMapping);

    }

}
