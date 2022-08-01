package com.funtionallnterfaces;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SuppplierExample {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = ()->{
            return new Student("Adam",2,3.6, "male",10, Arrays.asList("swimming", "basketball","volleyball"));
        };

        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

        System.out.println("Student is : " + studentSupplier.get());

        System.out.println("Student are : " + listSupplier.get());



    }
}
