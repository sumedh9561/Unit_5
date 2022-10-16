package problem_1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.next();

        try {
            int num=Integer.parseInt(str);
            System.out.println(num*num);

        }catch (NumberFormatException e) {
            System.out.println("Entered input is not a valid format for an integer.");
        }
        System.out.println("The work has been done successfully");
    }

}
