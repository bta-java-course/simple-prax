package com.buseduc.javacourse.topic_03.task_5_mariiazakharova21;

import com.sun.javaws.JAuthenticator;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    // Вывести: a) список книг заданного автора;*/
    public List<Book> listBookOfAuthor(String author) {
        List<Book> books = new ArrayList<>();
        for (Book book : this.books
        ) {
            for (String author1 : book.getAuthors()
            ) {
                if (author == author1) {
                    books.add(book);
                }
            }
        }
        return books;
    }

    /* b) список книг, выпущенных заданным издательством;*/
    public List<Book> listBookOfPublisher(String publisher) {
        List<Book> books = new ArrayList<>();
        for (Book book : this.books
        ) {
            if (publisher == book.getPublishingHouse()) {
                books.add(book);
            }
        }
        return books;

    }

    /* c) список книг, выпущенных после заданного года.*/
    public List<Book> listBooksAfterYear(int year) {
        List<Book> books = new ArrayList<>();
        for (Book book: this.books
             ) {
            if (year < book.getYearOfPublishing())
                books.add(book);
        }
        return books;
    }
}
