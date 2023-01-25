package com.optional;

import com.data.Student;
import com.data.StudentDataBase;
import java.util.Optional;

public class OptionalExample {

    public static String getStudentName(){
        Student student = StudentDataBase.studentSupplier.get();
        if(student !=null){
            return student.getName();
        }
        return null;
    }

    public static Optional<String> getStudentNameOption(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(studentOptional.isPresent()){
            return studentOptional.map(Student::getName);
        }
        return Optional.empty();  // Represent an optional object with no value
    }

    public static void main(String[] args) {
//        String name = getStudentName();
//        if (name != null) {
//            System.out.println("Length of the student name : " + name.length());
//        } else {
//            System.out.println("Name not found");
//        }

        Optional<String> stringOptional = getStudentNameOption();
        if(stringOptional.isPresent()){
            System.out.println("Length of the student name : " + stringOptional.get().length());
        }else{
            System.out.println("Name not found!   ");
        }
    }
}
