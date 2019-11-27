package com.buseduc.javacourse.topic_02.Task_09_be78ar;

// Enum contains month with russian title translation
public enum Months {
    JANUARY("Январь"),
    FEBRUARY("Февраль"),
    MARCH("Март"),
    APRIL("Апрель"),
    MAY("Май"),
    JUNE("Июнь"),
    JULY("Июль"),
    AUGUST("Август"),
    SEPTEMBER("Сентябрь"),
    OCTOBER("Октябрь"),
    NOVEMBER("Ноябрь"),
    DECEMBER("Декабрь");

    private String title;

    Months(String title){
        this.title = title;
    }

    public static Months[] valueOf() {
        return Months.values();
    }

    public String getTitle(int i) {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}