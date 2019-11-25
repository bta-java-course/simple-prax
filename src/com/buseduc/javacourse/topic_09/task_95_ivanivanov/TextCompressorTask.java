package com.buseduc.javacourse.topic_09.task_95_ivanivanov;

import com.buseduc.javacourse.utils.InputUtils;

import java.util.*;

public class TextCompressorTask {
    static Map<String, Integer> textMapping = new HashMap<>();
    static Map<Integer, String> invertedMapping = new HashMap<>();
    static List<Integer> encodedText = new ArrayList<>();
    public static void main(String[] args) {
        String text = InputUtils.getTextFromInput();
        String[] words = text.split(" ");
        Arrays.stream(words).forEach(w -> {
            int value = 1;
            if(textMapping.get(w) == null) {
                textMapping.put(w, value);
            } else {
                value = textMapping.get(w);
                textMapping.put(w, ++value);
            }
            invertedMapping.put(value, w);
        });
        Arrays.stream(words).forEach(w -> {
            int value = 0;
            value = textMapping.get(w);
            encodedText.add(value);
        });

        System.out.println(encodedText);
    }

}
