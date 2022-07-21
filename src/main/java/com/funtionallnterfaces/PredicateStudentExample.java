package com.funtionallnterfaces;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> p1 = (student -> student.getGradeLevel()>=3);

    public static void filterStudentByGradeLevel(){
        List<Student> studentList =  StudentDataBase.getAllStudents();

        studentList.forEach((student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        }));
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
    }
}
