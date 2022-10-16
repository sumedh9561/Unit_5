package com.masai.problem_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library l1=new Library();

        Scanner sc= new Scanner(System.in);

        System.out.println("1.Add Book");
        System.out.println("2.Display all book details");
        System.out.println("3.Search Book by author");
        System.out.println("4.Search book by ISBN");
        System.out.println("5.Exit");


        int choice=sc.nextInt();
        while (choice!=5) {

            if(choice==1) {
                System.out.println("Enter the isbn no: ");
                int isbn=sc.nextInt();
                System.out.println("Enter the book name: ");
                sc.nextLine();
                String boname=sc.nextLine();
                System.out.println("Enter the author name: ");
                String auname=sc.nextLine();

                try {
                    l1.addBook(new Book(isbn, boname, auname));
                } catch (BookException e) {
                    // TODO Auto-generated catch block
                    System.out.println(e.getMessage());
                }
                System.out.println();
                System.out.println("1.Add Book");
                System.out.println("2.Display all book details");
                System.out.println("3.Search Book by author");
                System.out.println("4.Search book by ISBN");
                System.out.println("5.Exit");

                choice=sc.nextInt();

            }

            else if(choice ==2) {

                try {

                    l1.viewAllBooks().forEach(n -> System.out.println(n));
                } catch (BookException e) {
                    // TODO Auto-generated catch block
                    System.out.println(e.getMessage());
                }

                System.out.println();
                System.out.println("1.Add Book");
                System.out.println("2.Display all book details");
                System.out.println("3.Search Book by author");
                System.out.println("4.Search book by ISBN");
                System.out.println("5.Exit");

                choice=sc.nextInt();

            }

            else if(choice ==3) {

                sc.nextLine();
                String autname=sc.nextLine();

                try {
                    l1.viewBooksByAuthor(autname).forEach(n -> System.out.println(n));
                } catch (BookException e) {
                    // TODO Auto-generated catch block
                    System.out.println(e.getMessage());
                }

                System.out.println();
                System.out.println("1.Add Book");
                System.out.println("2.Display all book details");
                System.out.println("3.Search Book by author");
                System.out.println("4.Search book by ISBN");
                System.out.println("5.Exit");

                choice=sc.nextInt();

            }
            else if(choice==4) {

                int isb= sc.nextInt();

                try {
                    System.out.println(l1.getBookByISBN(isb));
                } catch (BookException e) {
                    // TODO Auto-generated catch block
                    System.out.println(e.getMessage());
                }

                System.out.println();
                System.out.println("1.Add Book");
                System.out.println("2.Display all book details");
                System.out.println("3.Search Book by author");
                System.out.println("4.Search book by ISBN");
                System.out.println("5.Exit");

                choice=sc.nextInt();


            }
        }
        System.out.println("Thank you");
    }
}