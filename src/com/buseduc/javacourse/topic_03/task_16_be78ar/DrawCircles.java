package com.buseduc.javacourse.topic_03.task_16_be78ar;


/**
 * @author be78ar
 * Тема 3. КЛАССЫ И ОБЪЕКТЫ
 * Задание 3.16.
 * Определить класс Окружность. Определить площадь и длину окружности. Создать список объектов.
 * Определить наибольший и наименьший по площади (периметру) объект.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class DrawCircles {


    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<>();

        int i = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("INFO. Для прекращения ввода введите нечисленное значение, ноль или отрицательное число");
        String hint = "Введите длину радиуса круга: ";
        System.out.println(hint);
        while (scanner.hasNext()) {
            System.out.println(hint);
            String nextInput = scanner.next();
            try {
                double r = Double.parseDouble(nextInput);
                if (r <= 0) {
                    System.out.println("В трёхмерном пространстве такого не бывает");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Вы ввели какую то ерунду!");
                break;
            }
            double radius = Double.parseDouble(nextInput);

            Circle circle = new Circle(radius, "circle ");
            double sq = circle.CircleSquare(); // calculate circle square
            double l = circle.CircleLength();  // calculate circle length
            circle.setName("circle " + i);
            System.out.println("У нас новый круг :" + circle.getName() + ", его площадь = " + sq +
                        ", длина окружности = " + l);
            i++;
            circles.add(circle);
        }

        scanner.close();
        Circle last = circles.get(circles.size()-1);
        circles.sort(Comparator.comparingDouble(Circle::getRadius));
        System.out.println("Наименьший круг из получившихся :" + circles.get(0).getName() + ", наибольший круг " +
                last.getName());
    }

}
