package com.stream;

import com.data.StudentDataBase;

public class StreamMatchExample {

    public static boolean allMatch(){
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa() >= 3.8);
    }


    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa() >= 4.0);
    }


    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa() >= 4.0);
    }

    public static void main(String[] args) {
        System.out.println("Result of All Match :" +allMatch());
        System.out.println("Result of Any Match :" +anyMatch());
        System.out.println("Result of None Match :" +noneMatch());

    }
}
