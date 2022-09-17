package com.stream;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        //student name their activities in a map

        Map<String, List<String>> studentMap =  StudentDataBase.getAllStudents().stream()
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentMap);

    }
}
