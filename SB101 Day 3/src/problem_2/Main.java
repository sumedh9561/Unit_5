package problem_2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your date of birth in dd-MM-yyyy format");
        String dob = sc.next();
        try {
            LocalDate d1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            LocalDate c1 = LocalDate.now();

            Period p = Period.between(d1, c1);
            System.out.println("Your Current Age is :" + p);
            if (c1.getYear() <= d1.getYear())
                System.out.println("Date should not be in Future");

        } catch (Exception e) {
            System.out.println("Please enter the date in correct format");
        }
    }
}

