package problem_2;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Predicate<Student> p = new MyPredicate();

        boolean ans=p.test(new Student(101,"Rahul",400));

        System.out.println(ans);

        //using LE"
        System.out.println("Predicate====================");
        Predicate<Student> p1=(s)->s.getMarks()>500;

        System.out.println(p1.test(new Student(102,"Mohit",600)));


        System.out.println("Consumer=========================");

        Consumer<Student> c2=
                stud -> {

                    System.out.println("Roll is :"+stud.getRollNumber());
                    System.out.println("Name is :"+stud.getName());
                    System.out.println("Marks is :"+stud.getMarks());

                };
        c2.accept(new Student(10, "N1", 500));


        System.out.println("Function==================");

        Function<Student, String> f2 =
                s -> s.getMarks() > 500?"Pass": "Fail";



        System.out.println(f2.apply(new Student(10, "N1", 850)));

        System.out.println("Supplier=============================");



        Supplier<String> s2 =
                () -> "This message from the LE";


        System.out.println(s2.get());




    }


}





