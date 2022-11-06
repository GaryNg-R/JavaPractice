package com.stream;

import com.data.Student;
import com.data.StudentDataBase;

public class StreamMapReduceExample {


    public static int nomOfNoteBooks(){
        int numOfNoteBooks = StudentDataBase.getAllStudents().stream()  //Stream<Student>
                .map(Student::getNoteBooks) //Stream<Integer>
                //.reduce(0,(a,b) -> a+b);
                .reduce(0,Integer::sum);
        return numOfNoteBooks;
    }

    public static void main(String[] args) {


        System.out.println("Nums of note books " + nomOfNoteBooks());


    }
}
