package com.masai.problem_1;

import java.util.Objects;

public class Book {

    private int isbn;
    private String bookName;
    private String author;

    public Book() {
        // TODO Auto-generated constructor stub
    }

    public Book(int isbn, String bookName, String author) {
        super();
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", bookName=" + bookName + ", author=" + author + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookName, isbn);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return Objects.equals(author, other.author) && Objects.equals(bookName, other.bookName) && isbn == other.isbn;
    }



}
