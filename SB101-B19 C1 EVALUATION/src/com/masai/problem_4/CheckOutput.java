package com.masai.problem_4;

public class CheckOutput {

    public static void main(String args[]) {
        try {
            System.out.print("A");
            int num = 99 / 0;
            System.out.print("B");
        } catch (ArithmeticException ex) {
            System.out.print("C");
        } catch (Exception ex) {
            System.out.print("D");
        }
        System.out.print("E");

    }
    }
