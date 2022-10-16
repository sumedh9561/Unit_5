package problem_2;

import java.util.Comparator;



class SortByMark implements Comparator<Student> {


    public int compare(Student a, Student b)
    {
        return a.Marks - b.Marks;
    }
}


