package com.buseduc.javacourse.topic_04.task_18_be78ar;

import com.buseduc.javacourse.utils.InputUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author be78ar
 * Тема 4. СТРОКИ
 * Задание 4.18
 * В заданном тексте найти сумму всех встречающихся цифр.
 */

public class NumeralSumm {
    public static void main(String[] args) {
        String text = InputUtils.getTextFromInput();
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(text);
        List <String> chars = new ArrayList<>();
        // search for numeric symbols in string and put them to arrayList
        while (matcher.find()) {
            MatchResult nums = matcher.toMatchResult();
            chars.add(nums.group());
        }
        //create char array from String array
        char[] digits = String.join("", chars).toCharArray();
        int i = 0;
        int j = 0;
        while (i < digits.length){
            int k = Integer.parseInt(String.valueOf(digits[i])); //parse char from array to integer
            j += k;
            i++;
        }
        System.out.println("Сумма всех цифр в тексте равна " + j);
    }
}
