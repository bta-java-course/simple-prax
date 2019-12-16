package com.buseduc.javacourse.topic_04.task_26_mariiazakharova21;

public class Word {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String getString() {
        return this.word;
    }

    public int compare(Word word) {
        return this.word.toLowerCase().compareTo(word.getString().toLowerCase());
    }
}
