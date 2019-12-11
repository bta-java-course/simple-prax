package com.buseduc.javacourse.topic_05.task_05_03_mah0neh0ne;

/**
 * @author mah0neh0ne
 * Тема 5. ВВОД/ВЫВОД
 * Задание 5_03. В каждой строке найти слова, начинающиеся с гласной буквы.
 *
 */

public class FiveTask {
    public static void main(String[] args) throws Exception {

        String[] arr = {"one", "no one", "", "u", " A cook", "a any o", "o O "};
        String str;
        for (String s : arr) {

            str = n(s);
            System.out.println("Result of n(" + s + "): '" + str + "'");
        }
    }

    static char[] chars = "aeiou".toCharArray();
    static String n(String s) {

        StringBuilder sb = new StringBuilder();
        boolean start = true, word = false;
        char[] schars = s.toCharArray();
        char c;
        for (int i = 0; i <= schars.length; i++) {

            c = i < schars.length ? Character.toLowerCase(schars[i]) : ' ';
            if (Character.isWhitespace(c)) {

                if (word) {

                    sb.append(' ');
                    word = false;
                }

                start = true;
            }
            else if (start) {

                start = false;
                for (char ch : chars) {

                    if (c == ch) {

                        word = true;
                        break;
                    }
                }
            }


            if (word) {

                sb.append(schars[i]);
            }
        }

        return sb.toString().trim();
    }
}

