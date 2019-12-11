package com.buseduc.javacourse.topic_07.task_07_17_mah0neh0ne;

import java.util.Arrays;

public class HallForSession {
    private final String name;
    private final String[][] hall;

    public HallForSession(String name, int row, int place) {
        this.name = name;
        this.hall = new String[row][place];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < place; j++) {
                hall[i][j] = "Free";
            }
        }
    }

    public void Reserved(int row, int place) {
        if (hall[row - 1][place - 1].equalsIgnoreCase("Busy")) {
            throw new IllegalArgumentException("This place is ordered");
        } else {
            hall[row - 1][place - 1] = "Busy";
        }
    }

    public int SumSellTickets() {
        int sumTickets = 0;
        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                if (hall[i][j].equals("Busy")) {
                    sumTickets++;
                }
            }
        }
        return sumTickets;
    }

    public int SumFreeTickets() {
        int sumTickets = 0;
        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                if (hall[i][j].equals("Free")) {
                    sumTickets++;
                }
            }
        }
        return sumTickets;
    }

    public String getName() {
        return name;
    }

    public String[][] getHall() {
        return hall;
    }

    @Override
    public String toString() {
        return "HallForSession{" +
                "name='" + name + '\'' +
                ", hall=" + Arrays.toString(hall) +
                '}';
    }
}

