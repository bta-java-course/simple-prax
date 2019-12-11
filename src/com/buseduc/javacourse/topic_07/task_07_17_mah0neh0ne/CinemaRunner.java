package com.buseduc.javacourse.topic_07.task_07_17_mah0neh0ne;

/**
 * @author mah0neh0ne
 * Тема 7. ВСТРОЕННЫЕ КЛАССЫ
 * Задание 07_17.Создать класс Cinema с внутренним классом
 * с помощью объектов которого можно хранить информацию об адресах кинотеатров, фильмах и времени начала сеансов.
 *
 */



import java.time.LocalDate;

public class CinemaRunner {
    public static void main(String[] args) {
        MovieSession m2 = new MovieSession(new Movie("Man X", 2008, 125, "Movie about superhero"), new HallForSession("Ascold", 10, 10), 150, LocalDate.parse("2018-10-20"));

        m2.getHall().Reserved(5, 6);
        m2.getHall().Reserved(2, 4);
        m2.getHall().Reserved(7, 1);
        m2.getHall().Reserved(7, 2);
        m2.getHall().Reserved(9, 2);

        System.out.println("----------------------------------------------------------");
        System.out.println("Hall`s name - " + m2.getHall().getName());
        System.out.println(m2.getFilm());
        System.out.println("Amount of tickets sold - " + m2.getHall().SumSellTickets());
        System.out.println("Amount of tickets 'Free' - " + m2.getHall().SumFreeTickets());
        System.out.println("The sum of tickets sold - " + m2.sumMoney());
        System.out.println("-----------------------------------------------------------");
    }
}

//----------------------------------------------------------
//Hall`s name - Ascold
//Movie{name='Man X', release=2008, duration=125, descripsion='Movie about superhero'}
//Amount of tickets sold - 5
//Amount of tickets 'Free' - 95
//The sum of tickets sold - 750
//-----------------------------------------------------------


