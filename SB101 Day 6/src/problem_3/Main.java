package problem_3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        HashMap<String, Student> st = new HashMap<String, Student> ();

        st.put("Delhi", new Student(1, "S1", "@s1", 130));
        st.put("Haryana", new Student(2, "S3", "@s3", 160));
        st.put("Mumbai", new Student(3, "S2", "@s2", 200));
        st.put("Kanpur", new Student(4, "S5", "@s5", 120));
        st.put("Nagpur", new Student(5, "S4", "@s4", 80));



        Intr intr = map -> {

            Set <Map.Entry<String,Student>> set = map.entrySet();

            List<Map.Entry<String,Student>> l1=new ArrayList<>(set);

            Collections.sort(l1,(s1,s2) -> s1.getValue().getName().compareTo(s2.getValue().getName()));

            LinkedHashMap<String, Student> nmap = new LinkedHashMap<String, Student> ();

            l1.stream().forEach(s -> nmap.put(s.getKey(), s.getValue()));
            return nmap;
        };

        LinkedHashMap<String, Student> mbap =  (LinkedHashMap<String, Student>) intr.sortMapUsingStudentName(st);

        mbap.entrySet().stream().forEach(s -> System.out.println(s)); // using stream api.

//	for(Map.Entry<String,Student> m:mbap.entrySet()) {
//		System.out.println(m);
//	}

    }


}