package com.buseduc.javacourse.topic_06_task_06_3_mah0neh0ne;



public class Phrase {
    private String value="";

    public void addValue(Word word) {
        value += " " + word.getValue();
    }

    public String getValue() {
        return value;
    }
}

