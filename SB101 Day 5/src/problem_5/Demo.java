package problem_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Demo {

    public static void main(String[] args) {
        List<Product> productlist = new ArrayList<Product>();
        productlist.add(new Product(1, "Laptop", 5, 25000));
        productlist.add(new Product(2, "Mobile", 6, 30000));
        productlist.add(new Product(3, "Table", 7, 35000));
        productlist.add(new Product(4, "Chair", 8, 40000));
        productlist.add(new Product(5, "Pencil", 9, 45000));

        System.out.println("Before Sorting the Product data:");
        System.out.println("===================================================================");

        productlist.forEach((s) -> System.out.println(s));

        System.out.println("                                                                          ");
        System.out.println("                                                                          ");

        System.out.println("After Sorting the Product data by Price :");
        System.out.println("====================================================================");

        productlist.sort((Product s1, Product s2) -> s2.getPrice() - s1.getPrice());

        productlist.forEach((s) -> System.out.println(s));

    }
}
