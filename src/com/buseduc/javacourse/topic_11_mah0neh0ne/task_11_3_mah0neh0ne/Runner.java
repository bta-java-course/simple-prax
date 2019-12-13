package com.buseduc.javacourse.topic_11_mah0neh0ne.task_11_3_mah0neh0ne;

public class Runner {

    public static void main(String[] args) {
        DinnerBuilder dinner = new StandardDinner();
        Dinner stDin = Director.construct(dinner);
        stDin.show();
    }
}
