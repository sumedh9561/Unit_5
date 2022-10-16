package problem_2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        Queue <Product> p =new PriorityQueue<Product>(new ProductComp()) ;

//		System.out.println("enter number of entries you want to make");

//		int num=sc.nextInt();

        p.add(new Product(1,"n1",10));
        p.add(new Product(2,"n2",14));
        p.add(new Product(3,"n3",12));
        p.add(new Product(4,"n4",13));


        Iterator<Product> itr= p.iterator();

        while(itr.hasNext()) {

            Product s;
            if(( s=p.poll())!=null) {
                System.out.println(s);
            };

        }
    }

}

