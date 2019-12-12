package com.buseduc.javacourse.topic_03.task_5_mariiazakharova21;

import java.util.List;

/**
 * @author MariiaZakharova21
 * Тема 3. КЛАССЫ И ОБЪЕКТЫ
 * Задание 5
 * Book: id, Название, Автор(ы), Издательство, Год издания, Количество страниц, Цена, Тип переплета.
 * Создать массив объектов. Вывести: a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 * <p>
 * Создать классы, спецификации которых приведены ниже.
 * Определить конструкторы и методы setТип(), getТип(), toString().
 * Определить методы в классе, создающем массив объектов.
 * Задать критерий выбора данных и вывести эти данные на консоль.
 * В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
 */

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("Game Of Thrones", "BCL", 1996, new String[]{"George Martin"}),
                new Book("Eat, Pray, Love", "BCL", 2006, new String[]{"Elizabeth Gilbert"}),
                new Book("It Ends With Us", "BCL", 2016, new String[]{"Colleen Hoover"}),
                new Book("Das Lavendelzimmer", "BCL", 2015, new String[]{"Nina George"}),
                new Book("A Clash of Kings", "BCL", 1998, new String[]{"George Martin"}),
                new Book("Harry Potter and the Philosopher's (Sorcerer's) Stone", "BCL", 1997, new String[]{"J.K.Rowling"}),
                new Book("Harry Potter and the Chamber of Secrets", "BCL", 1998, new String[]{"J.K.Rowling"}),
                new Book("Harry Potter and the Prisoner of Azkaban", "BCL", 1999, new String[]{"J.K.Rowling"}),
        };

        Library library = new Library(books);

        System.out.println("Книги автора: ");
        printBooks(library.listBookOfAuthor("George Martin"));
        System.out.println("Книги издательства: ");
        printBooks(library.listBookOfPublisher("BCL"));
        System.out.println("Книги выпущенные после: ");
        printBooks(library.listBooksAfterYear(1998));
    }

    public static void printBooks(List<Book> books) {
        for (Book book : books
        ) {
            System.out.println(book.toString());
        }
    }
}
