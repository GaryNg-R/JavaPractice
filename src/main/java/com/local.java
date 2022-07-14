package com;

import java.util.*;

public class local {


    public static String gridChallenge(List<String> grid) {
        List<String> temp = new ArrayList<>();
        for(int i = 0; i < grid.size(); i ++){
            char charArr[] = grid.get(i).toCharArray();
            Arrays.sort(charArr);
            temp.add(String.valueOf(charArr));
        }


        for(int i = 1; i < temp.size(); i ++) {
            for(int j = 0; j < temp.size(); j ++){

                if(temp.get(i-1).charAt(j) > temp.get(i).charAt(j)){

                    return "No";
                }
            }
           // System.out.println("one round");
        }

        return "Yes";
    }

    public static void main(String[] args) {
        List<String> grid = List.of(new String[]{"eabcd", "fghij", "olkmn", "trpqs", "xywuv"});
        System.out.println(gridChallenge(grid));
    }
}

/*
*  abc
*  ade
*  efg
* */