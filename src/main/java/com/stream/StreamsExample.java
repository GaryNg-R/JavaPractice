package com.stream;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {


        //student name their activities in a map
        Predicate<Student> studentPredicate = (student -> student.getGradeLevel() >=3);
        Predicate<Student> studentGpaPredicate = (student -> student.getGpa() >=3.9);
        Predicate<Student> studentActivities = (student -> student.getActivities().size() >3);

//        Map<String, List<String>> studentMap =  StudentDataBase.getAllStudents().stream()
//                .filter(studentPredicate)
//                .filter(studentGpaPredicate)
//                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        Map<String, List<String>> studentMap =  StudentDataBase.getAllStudents().parallelStream()
                .peek(student -> {
                    System.out.println(student);
                })
                .filter(studentPredicate)
                .filter(studentGpaPredicate)
                .peek(student -> {
                    System.out.println("after two filer "+ student);
                })
                .filter(studentActivities)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));


        System.out.println(studentMap);

    }
}
