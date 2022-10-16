package problem_2;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<City> citylist = new ArrayList<City>();
        citylist.add(new City( "Amravti"));
        citylist.add(new City( "Baramati"));
        citylist.add(new City( "Faridabad"));
        citylist.add(new City( "Mirzapur"));
        citylist.add(new City( "Omkareshwar"));

        citylist.sort((City s1, City s2) -> s2.getCity().compareTo(s1.getCity()));
        citylist.forEach((s) -> System.out.println(s));
    }

}


