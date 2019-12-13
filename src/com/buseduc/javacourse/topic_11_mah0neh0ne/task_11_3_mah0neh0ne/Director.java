package com.buseduc.javacourse.topic_11_mah0neh0ne.task_11_3_mah0neh0ne;

public class Director {

    public static Dinner construct(DinnerBuilder builder){
        builder.buildFirst();
        builder.buildMain();
        builder.buildDesert();
        return builder.getDinner();
    }
}
