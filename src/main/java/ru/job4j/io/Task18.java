package ru.job4j.io;

/*
Дана сторона квадрата a. Найти его периметр.
Дан радиус окружности r. Найти длину окружности и площадь круга.*
Результат каждого вычисления выводите в новой строке с точностью до десятых.
 */

import java.util.Locale;

public class Task18 {

    public String findThePerimeter(double value) {
        return String.format(Locale.ENGLISH, "%(.1f", Math.PI * value);
    }

    public String findTheCircumferenceOfACircle(double value) {
        return String.format(Locale.ENGLISH, "%(.1f", 2 * Math.PI * value);
    }

    public String findTheAreaOfACircle(double value) {
        return String.format(Locale.ENGLISH, "%(.1f", Math.PI * Math.pow(value, 2));
    }
}
