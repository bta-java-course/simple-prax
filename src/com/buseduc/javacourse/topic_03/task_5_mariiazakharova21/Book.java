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

    public Book(String title, String publishingHouse, int yearOfPublishing, String[] authors) {
        this.id = title.toLowerCase() + publishingHouse + yearOfPublishing;
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPublishingHouse(String publishingHouse) {

        this.publishingHouse = publishingHouse;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setYearOfPublishing(int yearOfPublishing) {

        this.yearOfPublishing = yearOfPublishing;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setNumberOfPages(int numberOfPages) {

        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setTypeOfBinding(TypeOfBinding typeOfBinding) {

        this.typeOfBinding = typeOfBinding;
    }

    public TypeOfBinding getTypeOfBinding() {
        return this.typeOfBinding;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String[] getAuthors() {
        return this.authors;
    }

    @Override
    public String toString() {
        return String.format("{ id:%s, title:%s, publishingHouse:%s, year:%s, pages:%o, price:%f, type:%s, authors:%s }",
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
