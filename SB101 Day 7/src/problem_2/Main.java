package problem_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(9, "F1", 750));
        students.add(new Student(15, "F2", 450));
        students.add(new Student(11, "F3", 650));
        students.add(new Student(15, "F4", 850));
        students.add(new Student(19, "F5", 410));

        // Get the highest marks Student by using Stream API.
        Student MaxStudent = students.stream().max((s1, s2) -> s1.getMark() > s2.getMark() ? +1 : -1).get();

        System.out.println("Get the Highet Marks --> " + MaxStudent);

    }

}
