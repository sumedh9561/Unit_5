package problem_4;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StatesBySort implements Comparator<Map.Entry<String, List<String>>> {

    @Override
    public int compare(Entry<String, List<String>> o1, Entry<String, List<String>> o2) {
        // TODO Auto-generated method stub

        String s1 =    o1.getKey();
        String s2 =    o2.getKey();

        return  s2.compareTo(s1);

    }

}

