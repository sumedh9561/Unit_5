package problem_4;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class MarkBySort implements Comparator<Map.Entry<String,Student>> {

    @Override
    public int compare(Entry<String, Student> o1, Entry<String, Student> o2) {
        // TODO Auto-generated method stub
        Student s1 = o1.getValue();
        Student s2 = o2.getValue();

        if (s1.getMarks() > s2.getMarks()) {
            return +1;
        } else if (s1.getMarks() < s2.getMarks()) {
            return -1;

        } else {
            return 0;
        }

    }

}
