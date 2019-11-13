package com.buseduc.javacourse.topic_01.task_19_be78ar;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.jnlp.ClipboardService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author be78ar
 * Тема 1. ОСНОВЫ ООП
 * Задание 1.19.
 * Из n целых чисел вывести числа-палиндромы, значения которых в прямом и обратном порядке совпадают.
 */
public class Task19 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
            System.out.println("INFO. Для прекращения ввода введите нечисленное значение.");
            String hint = "Введите число: ";
            List<Integer> nums = new ArrayList<>();
            System.out.println(hint);
            while (scanner.hasNext()) {
                System.out.println(hint);
                String nextInput = scanner.next();
                try {
                    if(nextInput.length()<2){
                        System.out.println("Число с одним разрядом не может быть палиндромом");
                    }
                        nums.add(Integer.parseInt(nextInput));
                } catch (Exception e) {
                    System.out.println("Конец ввода");
                    break;
                }
            }
            scanner.close();

        List<String> palindrome = new ArrayList<>();
        for (int n : nums) {
            String num = Integer.toString(n);
            if (isNumberPalindrome(num) && num.length()>=2) {
                palindrome.add(num);
            }

        }
        System.out.println("Числа палиндромы: " + palindrome);
    }
// method to check string is palindrome
    private static boolean isNumberPalindrome(String num) {
        int i = 0, j = num.length()-1;
        while (i < j) {
            if (num.charAt(i) != num.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
