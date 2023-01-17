package com.optional;

import com.data.Bike;
import com.data.Student;
import com.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapExample {
    //filter
    public static void optionalFilter(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional
                .filter(student -> student.getGpa() >= 3.5)
                .ifPresent(student -> System.out.println(student));

    }

    //map
    public static void optionalMap(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(studentOptional.isPresent()){
            Optional<String> studentName = studentOptional
                    .filter(student -> student.getGpa() >=3.5)
                    .map(Student::getName);
            System.out.println(studentName);
        }
    }

    //flatmap
    public static void optionalFlatMap(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> name = studentOptional
                .filter(student -> student.getGpa() >=3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName);

        name.ifPresent(s -> System.out.println("name " + name));
    }


    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
