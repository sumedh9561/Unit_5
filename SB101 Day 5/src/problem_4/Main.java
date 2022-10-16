package problem_4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> city = new ArrayList<>();

        city.add("Akola");
        city.add("Amaravti");
        city.add("Wardha");
        city.add("Nagpur");
        city.add("Chandrapur");

        PrintList CityName = cities -> System.out.println("Using Lambda Expression Print the City : " + cities);

        CityName.display(city);

    }

}

