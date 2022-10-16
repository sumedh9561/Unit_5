package problem_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {

        List<Product> productlist = new ArrayList<>();
        productlist.add(new Product(1, "Cell", 10, 5));
        productlist.add(new Product(2, "Watch", 5, 10));
        productlist.add(new Product(3, "Headphone", 15, 8));
        productlist.add(new Product(4, "Mobile", 20, 20));
        productlist.add(new Product(5, "Tablet", 25, 12));

        List<Product> filteredlist = productlist.stream().filter(s -> s.getQuantity() > 10)
                .collect(Collectors.toList());
        System.out.println("All Product List :");
        System.out.println("******************");
//		System.out.println(productlist);
        productlist.forEach(s -> System.out.println(s));
        System.out.println("==========================================================================");

        System.out.println("Filered List Product List By Price greater than 10 :");
        System.out.println("****************************************************");
//		System.out.println(filteredlist);
        filteredlist.forEach(f -> System.out.println(f));
        System.out.println("==========================================================================");

        // using lambda expression
        // filteredlist in ascending order

        Collections.sort(filteredlist, (o1, o2) -> (o1.getPrice() - (o2.getPrice())));
        System.out.println("Ascending order of the filtered List by Price  => ");
        System.out.println("**************************************************");
//		System.out.println(filteredlist);
        filteredlist.forEach(s -> System.out.println(s));
        System.out.println("==========================================================================");

    }
}

