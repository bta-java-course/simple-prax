package com.buseduc.javacourse.topic_04.task_97_ivanivanov;

import static com.buseduc.javacourse.utils.InputUtils.getTextFromInput;

public class MyStringTask {
    public static void main(String[] args) {
        String text = getTextFromInput();
        int start = text.indexOf("*");
        System.out.println(start);
        if(start < 0) {
            System.out.println("delimiter * not found!");
            return;
        }
        if (++start >= text.length()) {
            System.out.println("end of text reached");
            return;
        }
        int end = text.indexOf("*", start);
        System.out.println("FOUND SECOND AT" + end);
        String result = text.substring(start, end);
        System.out.println("RESULT: " + result);
        String[] fragments = text.split("\\*");
        if (fragments.length < 3) {
            System.out.println("Not enough delimiters!");
            return;
        }
        System.out.println("RESULT: " + fragments[0] + fragments[2]);



    }
}
