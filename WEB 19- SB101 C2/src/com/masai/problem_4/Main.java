package com.masai.problem_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Virat",
                "Rohit",
                "Jadeja",
                "Rayadu",
                "Chehal",
                "Suresh",
                "Dhoni",
                "ABD",
                "Sanghakara",
                "Russal"
        );


        List<String> strlist=names.stream().filter(x->x.length() %2 ==0)
                .map(y->y.toUpperCase()).collect(Collectors.toList());



        List<String> desc = strlist.stream().sorted((str1, str2) ->
                str2.length() - str1.length()).collect(Collectors.toList());


        System.out.println("                     Original List                           ");


        names.forEach((name)->System.out.println(name));
        System.out.println("                      transformed List                        ");


        desc.forEach((value)->System.out.println(value));

    }

}