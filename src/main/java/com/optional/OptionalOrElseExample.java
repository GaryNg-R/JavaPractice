package com.optional;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    //orElse
    public static String optionalOrElse(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }

    //orElseGet
    public static String optionalElseGet(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseGet(()->"Default");
        return name;
    }

    //orElseThrow
    public static String optionalorElseThrow(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseThrow(()-> new RuntimeException("No Data Available"));
        return name;
    }
    public static void main(String[] args) {
        System.out.println("optionalOrElse : " + optionalOrElse());
        System.out.println("optionalElseGet : " + optionalElseGet());
        System.out.println("optionalorElseThrow : " + optionalorElseThrow());


    }
}
