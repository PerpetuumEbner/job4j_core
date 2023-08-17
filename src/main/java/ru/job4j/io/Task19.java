package ru.job4j.io;

/*
Напишите класс, который присваивает переменной х значение 9, а затем выводит на экран: в первой строке -
значение этой переменной с поясняющей надписью «Значение x равно 9», а во второй -
квадрат этого значения с выводом надписи "Значение x^2 равно 81".
 */

import java.util.Locale;

public class Task19 {
    public static void main(String[] args) {
        System.out.println(new Task19().systemPrintValue(9));
        System.out.println(new Task19().systemPrintValueNumberSquared(9));
    }

    public String systemPrintValue(int value) {
        return String.format("Значение x равно %s", value);
    }

    public String systemPrintValueNumberSquared(int value) {
        return String.format(Locale.ENGLISH, "Значение x^2 равно %.0f", Math.pow(value, 2));
    }
}
