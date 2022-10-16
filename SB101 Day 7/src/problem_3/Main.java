package problem_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> squares = numbers.stream().map(i -> i * i).collect(Collectors.toList());

        // Print the List using Lambda expressions.
        System.out.println("original list of numbers : ");
        numbers.forEach(n -> System.out.print(n+" "));

        System.out.println();
        System.out.println("==========================================");
        // Print the List using Lambda expressions.
        System.out.println("List After square operation on numbers  : ");
        squares.forEach(s -> System.out.print(s+" "));

    }

}

