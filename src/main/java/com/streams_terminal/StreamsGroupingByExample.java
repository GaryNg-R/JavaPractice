package com.streams_terminal;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {

    public static void groupStudentByGender(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(studentMap);
    }

    public static void customizedGroupingBy(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE" ));
        System.out.println(studentMap);
    }

    public static void twoLeveGrouping_1(){
        Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE" )));
        System.out.println(studentMap);
    }

    public static void twoLeveGrouping_2(){
        Map<String,Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        summingInt(Student::getNoteBooks)));
        System.out.println(studentMap);
    }

    public static void threeArgumentGroupBy(){
        LinkedHashMap<String, Set<Student>> studentLinkedHashMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        LinkedHashMap::new,toSet()));
        System.out.println(studentLinkedHashMap);
    }


    public static void calculateTopGpa(){
        Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentMapOptional);
    }

    public static void calculateTopGpa2(){
        Map<Integer, Student> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa))
                        ,Optional::get)));
        System.out.println(studentMapOptional);


        Map<Integer, Student> studentMapOptional2 = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student::getGpa))
                                ,Optional::get)));
        System.out.println(studentMapOptional2);
    }

    public static void main(String[] args) {
        //groupStudentByGender();
        //customizedGroupingBy();
        //twoLeveGrouping_1();
        //twoLeveGrouping_2();
        //threeArgumentGroupBy();
        calculateTopGpa2();



    }
}
