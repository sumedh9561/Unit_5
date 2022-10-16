package problem_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static List fun(List<? super Integer > l1){

        return l1;
    }

    public static void main(String[] args) {

        List<Integer> l1=new ArrayList<>();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of entries you want to make");
        int n=sc.nextInt();

        for(int i=0;i<n;i++) {
            int num=sc.nextInt();
            l1.add(num);
        }

        List obj=fun(l1);

        for(Object o:obj) {
            System.out.println(o);
        }


    }

}
