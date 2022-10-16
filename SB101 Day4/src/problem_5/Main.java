package problem_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name=sc.next();
        System.out.println("Enter Your Country");
        String country=sc.next();
        UserRegistration ur=new UserRegistration();
        try {
            ur.registerUser(name, country);
        } catch (InvalidCountryException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
    }

}

