package com.funtionallnterfaces;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> p1 = (student -> student.getGradeLevel()>=3);
    static Predicate<Student> p2 = (student -> student.getGpa()>=3.9);

    public static void filterStudentByGradeLevel(){
        List<Student> studentList =  StudentDataBase.getAllStudents();
        System.out.println("filterStudentByGradeLevel");
        studentList.forEach((student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        }));
    }
    public static void filterStudentByGpa(){
        List<Student> studentList =  StudentDataBase.getAllStudents();
        System.out.println("filterStudentByGpa");
        studentList.forEach((student -> {
            if(p2.test(student)){
                System.out.println(student);
            }
        }));
    }

    public static void filterStudent(){
        List<Student> studentList =  StudentDataBase.getAllStudents();
        System.out.println("filterStudent");
        studentList.forEach((student -> {
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        }));
    }


    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudent();
    }
}
