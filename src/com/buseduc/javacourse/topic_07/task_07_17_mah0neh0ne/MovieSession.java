package com.buseduc.javacourse.topic_07.task_07_17_mah0neh0ne;

import java.time.LocalDate;

public class MovieSession {
    private final Movie film;
    private final HallForSession hall;
    private final int price;
    private final LocalDate startTime;

    public MovieSession(Movie film, HallForSession hall, int price, LocalDate startTime) {
        this.film = film;
        this.hall = hall;
        this.price = price;
        this.startTime = startTime;
    }

    public int sumMoney() {
        return hall.SumSellTickets() * price;
    }

    public Movie getFilm() {
        return film;
    }

    public HallForSession getHall() {
        return hall;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    @Override
    public String toString() {
        return "MovieSession{" +
                "film=" + film +
                ", hall=" + hall +
                ", price=" + price +
                ", startTime=" + startTime +
                '}';
    }
}