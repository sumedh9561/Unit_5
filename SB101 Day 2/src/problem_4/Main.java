package problem_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map<String, Student> student = new HashMap<>();
        student.put("Akola", new Student(12, "Sumedh", 850));
        student.put("Amravati", new Student(12, "Gopal", 750));
        student.put("Wardha", new Student(16, "Pallavi", 810));
        student.put("Nagpur", new Student(14, "Gitanjali", 650));

        Set<Map.Entry<String, Student>> studentInSort = student.entrySet();

        for (Map.Entry<String, Student> s : studentInSort) {
            System.out.println(s.getKey() + " :-  " + s.getValue());
        }

        List<Entry<String, Student>> list = new ArrayList<Entry<String, Student>>(studentInSort);
        System.out.println("***********************************************************************");
        System.out.println("***************************              ******************************");
        System.out.println("*******                     Sort By Marks                      ********");

        Collections.sort(list, new MarkBySort());
        for (Entry<String, Student> mapping : list) {
            System.out.println(mapping.getKey() + "   ==>   " + mapping.getValue());
        }

    }
}
