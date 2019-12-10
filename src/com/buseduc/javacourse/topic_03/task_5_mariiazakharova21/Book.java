package com.buseduc.javacourse.topic_03.task_5_mariiazakharova21;

import java.awt.*;

public class Book {
    private String id;
    private String title;
    private String publishingHouse;

    private int yearOfPublishing;
    private int numberOfPages;

    private double price;

    public enum TypeOfBinding {soft, solid}

    private TypeOfBinding typeOfBinding;

    private String[] authors; //массив

    public Book(String title, String author) {  //конструктор
        this.title = title;
        this.authors = new String[]
                {
                        author
                };
    }

    public Book(String title, int numberOfPages, double price, String[] authors) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.authors = authors;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        System.out.println("Id книги: " + this.id);
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        System.out.println("Название книги: " + this.title);
        return title;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getPublishingHouse() {
        System.out.println("Издательство: " + this.publishingHouse);
        return publishingHouse;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getYearOfPublishing() {
        System.out.println("Год издательства: " + this.yearOfPublishing);
        return yearOfPublishing;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        System.out.println("Колисество страниц: " + this.numberOfPages);
        return numberOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        System.out.println("Цена: " + this.price);
        return this.price;
    }

    public void setTypeOfBinding(TypeOfBinding typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    public TypeOfBinding getTypeOfBinding() {
        System.out.println(" " + this.typeOfBinding);
        return this.typeOfBinding;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String[] getAuthors() {
        System.out.println("Автор: " + this.authors);
        return this.authors;
    }

    @Override
    public String toString() {
        return String.format("{ id:%s, title:%s, publishingHouse:%s, year:%d, pages:%d, price:%d, type:%s, authors:%s }",
                this.id,
                this.title,
                this.publishingHouse,
                this.yearOfPublishing,
                this.numberOfPages,
                this.price,
                this.typeOfBinding,
                String.join(", ", this.authors));
    }
}
