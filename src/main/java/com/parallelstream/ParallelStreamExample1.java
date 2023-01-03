package com.parallelstream;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample1 {

    public static List<String> sequentialPrintUniqueStudentActivities(){
        Long startTime = System.currentTimeMillis();
        List<String> studentAcitvities = StudentDataBase.getAllStudents()
                .stream() //Steam<Student>
                .map(Student::getActivities)   //Stream<List<String>>
                //using flatMap to change Stream<List<String>> to Stream<String>
                .flatMap(List::stream)   //Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in sequential : " + (endTime - startTime));
        return studentAcitvities;
    }


    public static List<String> parallelPrintUniqueStudentActivities(){
        Long startTime = System.currentTimeMillis();
        List<String> studentAcitvities = StudentDataBase.getAllStudents()
                .stream() //Steam<Student>
                .parallel()
                .map(Student::getActivities)   //Stream<List<String>>
                //using flatMap to change Stream<List<String>> to Stream<String>
                .flatMap(List::stream)   //Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in parallel : " + (endTime - startTime));
        return studentAcitvities;

    }


    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        sequentialPrintUniqueStudentActivities();
        parallelPrintUniqueStudentActivities();
    }
}
