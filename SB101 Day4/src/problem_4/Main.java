package problem_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the 2 numbers");
        String[] nums=sc.nextLine().split(" ");
        int n1=Integer.parseInt(nums[0]);
        int n2=Integer.parseInt(nums[1]);
        try {
            int sol=n1/n2;
            System.out.println( "The quotient of"+n1+"/"+n2+"="+sol);
        }catch (ArithmeticException ae) {
            // TODO: handle exception
            System.out.println("DivideByZeroException caught");
        }
        System.out.println("Inside finally block");


    }

}
