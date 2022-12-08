package com.stream;

import com.data.StudentDataBase;

public class StreamMatchExample {

    public static boolean allMatch(){
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa() >= 3.9);
    }

    public static void main(String[] args) {
        System.out.println("Result of All Match :" +allMatch());
    }
}
