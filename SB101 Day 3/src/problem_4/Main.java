package problem_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        HashMap<String, List<String>> hm = new HashMap<>();

        List<String> cities = new ArrayList<>();
        cities.add("Kolkata");
        cities.add("Haldia");
        cities.add("Durgapur");
        cities.add("Dhanwad");
        hm.put("WestBengal", cities);

        hm.put("Maharastra", Arrays.asList("Pune", "Mumbai", "Amrawati", "Kolhapur"));
        hm.put("Uttar Pradesh", Arrays.asList("Agra", "Lucknow", "Kanpur", "Varanasi"));

        for (Entry<String, List<String>> city : hm.entrySet()) {
            System.out.println(city.getKey() + " :-  " + city.getValue());
        }

        List<Entry<String, List<String>>> list = new ArrayList<Entry<String, List<String>>>(hm.entrySet());

        System.out.println("***********************************************************************");
        System.out.println("********                                                       ********");
        System.out.println("**************             Sort By States          ********************");

        Collections.sort(list, new StatesBySort());
        for (Entry<String, List<String>> mapping : list) {
            System.out.println(mapping.getKey() + "   ==>   " + mapping.getValue());
        }
    }
}

