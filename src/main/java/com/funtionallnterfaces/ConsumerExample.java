package com.funtionallnterfaces;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

//FuncationalInterface
public class ConsumerExample {

    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.print(student.getName() +" ");
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

    public static void printName(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }

    public static void printNameActivities(){
        System.out.println("printNameActivities");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4)); //consumer chaning
    }

    public static void printNameActivitiesUsingCondition(){
        System.out.println("printNameActivitiesUsingCondition");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9){
                c3.andThen(c4).accept(student);
            }
        }); //consumer chaning
    }

    public static void main(String[] args) {
//        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
//        c1.accept("testing");

     //   printName();

        printNameActivities();
        printNameActivitiesUsingCondition();

    }
}
