package com.streams_terminal;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

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

    public static void main(String[] args) {
        //groupStudentByGender();
        customizedGroupingBy();
    }
}
