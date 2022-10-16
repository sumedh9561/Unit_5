package problem_1;

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        System.out.println("start of main..");

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter num1 : ");
            int num1 = sc.nextInt();

            System.out.println("Enter num2 : ");
            int num2 = sc.nextInt();

            String message = null;
            int num3 = num1 / num2;

            if (num3 > 10) {
                message = "Welcome to Exception Handling ";
            }
            System.out.println("Message is :" + message.toUpperCase());
        } catch (NullPointerException npe) {
            System.out.println("String value is null");

        } catch (ArithmeticException qe) {
            System.out.println("num2 should not be 0");
        }

        catch (Exception e) {
            System.out.println("Please enter valid number");
        }

        System.out.println("end of main");
    }
}
