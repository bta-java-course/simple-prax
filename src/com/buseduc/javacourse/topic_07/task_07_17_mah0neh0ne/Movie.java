package com.buseduc.javacourse.topic_07.task_07_17_mah0neh0ne;

public class Movie {
    private final String name;
    private final int release;
    private final int duration;
    private final String descripsion;

    public Movie(String name, int release, int duration, String descripsion) {
        this.name = name;
        this.release = release;
        this.duration = duration;
        this.descripsion = descripsion;
    }

    public String getName() {
        return name;
    }

    public int getRelease() {
        return release;
    }

    public int getDuration() {
        return duration;
    }

    public String getDescripsion() {
        return descripsion;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", release=" + release +
                ", duration=" + duration +
                ", descripsion='" + descripsion + '\'' +
                '}';
    }
}

