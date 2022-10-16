package com.masai.problem_1;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> Books = new ArrayList<Book>();

    void addBook(Book book)throws BookException{

        boolean flag=true;
        for(Book b:this.Books) {

            if( b.getBookName().equals(book.getBookName()) || b.getIsbn()==book.getIsbn()) {
                flag=false;
                break;
            }
        }
        if(flag) {
            System.out.println("Book Added Successfully");
            Books.add(book);
        }else {
            BookException be=new BookException("Book is Already exist");
            throw be;
        }
    }

    List viewAllBooks()throws BookException{

        System.out.println(Books.size());
        if(Books.size()==0) {
            BookException be=new BookException("No book avaikable");
            throw be;
        }else {
            return Books;
        }
    }

    List viewBooksByAuthor(String author)throws BookException{


        List<Book> nb= new ArrayList<>();
        for(Book b:Books) {
            if(b.getAuthor().equals(author)) {
                nb.add(b);
            }
        }
        if(nb.size()==0) {
            BookException be=new BookException("No book found with this Author name");
            throw be;
        }else {
            return nb;
        }
    }

    Book getBookByISBN(int isbn)throws BookException{

//		boolean flag=true;
        for(Book b:Books) {
            if(b.getIsbn()==isbn) {
                return b;
            }
        }
        BookException be=new BookException("No book found with this ISBN number");
        throw be;

    }



}
