package com.buseduc.javacourse.topic_09.task_95_ivanivanov;

import com.buseduc.javacourse.utils.InputUtils;

import java.util.*;

public class TextCompressorTask {
    public static void main(String[] args) {
        List<Integer> dictionaryList = new ArrayList<>();
        Map<String, Integer> dictionaryMap = new HashMap<>();
        List<String> dictionary = new ArrayList<>();
        String text = InputUtils.getTextFromInput();
        String[] words = text.split(" ");
        final Integer[] index = new Integer[]{0};
        Arrays.stream(words).forEach(w -> {
            int newIndex = -1;
            if (dictionaryMap.containsKey(w)) {
                newIndex = dictionaryMap.get(w);
            } else {
                dictionaryMap.put(w, index[0]);
                dictionary.add(index[0], w);
            }
            if (newIndex < 0) {
                dictionaryList.add(index[0]);
                index[0] ++;
            } else {
                dictionaryList.add(newIndex);
            }
        });
        System.out.println(dictionaryList);
        System.out.println(dictionary);

        System.out.println("DECODING: ");
        String decoded = "";
        for (Integer ix : dictionaryList) {
            decoded += dictionary.get(ix) + " ";
        }
        System.out.println(decoded);
    }

}
