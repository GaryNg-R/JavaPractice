package com.funtionallnterfaces;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction <List<Student>, Predicate<Student>, Map<String, Double>> biFunction = ((students, studentPredicate) -> {
        Map<String, Double> stringGradeMap = new HashMap<>();
        students.forEach(student -> {
            if(studentPredicate.test(student)){
                stringGradeMap.put(student.getName(), student.getGpa());
            }
        });
        return stringGradeMap;
    });

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),PredicateStudentExample.p1));
    }
}
