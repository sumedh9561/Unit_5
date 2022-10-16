package problem_2;

import java.util.TreeMap;

public class Main {


    static void Example2ndConstructor()
    {
        TreeMap<Student, Integer> tree_map = new TreeMap<Student, Integer>(new SortByMark());

        // Mapping string values to int keys
        tree_map.put(new Student(07, "Amar", 333),2);
        tree_map.put(new Student(05, "Akhabr", 111),3);
        tree_map.put(new Student(03, "Anthani", 555),1);


        System.out.print("TreeMap: " + tree_map);
    }

    public static void main(String[] args)
    {

        System.out.println("TreeMap using " + "TreeMap(Comparator)" + " constructor:\n");
        Example2ndConstructor();
    }
}

