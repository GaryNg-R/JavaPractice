package com.stream;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class SteamsFlatMapExample {

    public static List<String> printStudentActivities(){
        List<String> studentAcitvities = StudentDataBase.getAllStudents().stream() //Steam<Student>
                .map(Student::getActivities)   //Stream<List<String>>
                //using flatMap to change Stream<List<String>> to Stream<String>
                .flatMap(List::stream)   //Stream<String>
                .collect(Collectors.toList());


        return studentAcitvities;
    }

    public static List<String> printUniqueStudentActivities(){
        List<String> studentAcitvities = StudentDataBase.getAllStudents().stream() //Steam<Student>
                .map(Student::getActivities)   //Stream<List<String>>
                //using flatMap to change Stream<List<String>> to Stream<String>
                .flatMap(List::stream)   //Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());


        return studentAcitvities;
    }

    public static long getStudentActivitiesCount(){
        long noOfStudentAcitvities = StudentDataBase.getAllStudents().stream() //Steam<Student>
                .map(Student::getActivities)   //Stream<List<String>>
                //using flatMap to change Stream<List<String>> to Stream<String>
                .flatMap(List::stream)   //Stream<String>
                .distinct() //Stream<String> -> with disinct function performed
                .count();

        return noOfStudentAcitvities;
    }


    public static void main(String[] args) {
        System.out.println("printStudentActivities "   + printStudentActivities());
        System.out.println("printUniqueStudentActivities "   + printUniqueStudentActivities());
        System.out.println("StudentActivities count"   + getStudentActivitiesCount());

    }
}
