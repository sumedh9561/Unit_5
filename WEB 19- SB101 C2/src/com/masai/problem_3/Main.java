package com.masai.problem_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Student> stu = Arrays.asList(
                new Student(1, "Virat", 380, "Mumbai"),
                new Student(2, "Rohit", 560, "Nagpur"),
                new Student(3, "Hardik", 490, "Uttarpradesh"),
                new Student(4, "D kartik", 660, "Kolkatta"),
                new Student(5, "Hooda", 700, "Bihar")
        );
        List<Employee> emp= stu.stream().filter(e -> e.getMarks()>500).map(e ->{

            return	new Employee(e.getRoll(), e.getName(), e.getMarks()*10000, e.getAddress());

        }).collect(Collectors.toList());

        emp.forEach(e -> System.out.println(e));
//


    }

}
