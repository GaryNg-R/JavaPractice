package com.stream;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }
    public static Optional<Student> findFirststudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }


    public static void main(String[] args) {
        Optional<Student> studentOptionalFindAny = findAnyStudent();
        if(findAnyStudent().isPresent()){
            System.out.println("Found the student: " + studentOptionalFindAny.get() );
        }else {
            System.out.println("Student not found");
        }

        Optional<Student> studentOptionalFindFirst = findFirststudent();
        if(findFirststudent().isPresent()){
            System.out.println("Found the student: " + studentOptionalFindFirst.get() );
        }else {
            System.out.println("Student not found");
        }
    }
}
