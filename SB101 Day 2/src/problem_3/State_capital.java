package problem_3;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

    public class State_capital {

        public static void main(String[] args) {
            Map<String,String> liskedhashMap=new LinkedHashMap<String,String>();

            liskedhashMap.put("Delhi", "New Delhi");
            liskedhashMap.put("Goa", "Panaji");
            liskedhashMap.put("Bihar", "Patna");
            liskedhashMap.put("Utter Pradesh", "Lucknow");
            liskedhashMap.put("Rajesthan", "Jaipur");

            Set<Map.Entry<String,String>> LHM=liskedhashMap.entrySet();
            for(Map.Entry<String, String> city:LHM) {
                System.out.println(city.getKey()+" "+city.getValue());
            }
        }

    }

