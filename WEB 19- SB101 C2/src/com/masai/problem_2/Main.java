package com.masai.problem_2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

                                              // Predicate //


        System.out.println("                    Predicate                ");

        Predicate<Student> pr= s -> s.getMarks()>500;

        System.out.println(pr.test(new Student(10, "Virat", 350, "Haryana")));
        System.out.println(pr.test(new Student(20, "Rohit", 650, "Mumbai")));



                                            // Consumer//

        System.out.println();
        System.out.println("                    Consumer");

        Consumer<Student> cos= s -> {

            System.out.println("roll = "+s.getRoll());
            System.out.println("name = "+s.getName());
            System.out.println("marks = "+s.getMarks());
            System.out.println("address = "+s.getAddress());

        };

        cos.accept(new Student(10, "Virat", 700, "Haryana"));




                                              // Supplier//

        System.out.println();
        System.out.println("                    Supplier");
        System.out.println("                                                                    ");

        Supplier<Student> ss= ()->new Student(10, "Virat", 550, "Haryana");

        System.out.println(ss.get());




                                              // Function  //
        System.out.println();
        System.out.println("                    Function");
        System.out.println("                                                         ");

        Function<String,Integer> fn = s->Integer.parseInt(s);


        System.out.println(fn.apply("15"));

    }

}