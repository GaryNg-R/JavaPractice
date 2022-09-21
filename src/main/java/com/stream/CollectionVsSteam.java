package com.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionVsSteam {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("jim");
        names.add("jenny");




        names.remove(0);
        System.out.println(names);


        //list to traversed loop and print and it can run a lot of times
        for(String name : names){
            System.out.println(name);
        }

        //collection to traversed loop  and print but you can only run one time and it will close the stream
        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
        //it will fail to run again nameStream.forEach(System.out::println);

    }
}
