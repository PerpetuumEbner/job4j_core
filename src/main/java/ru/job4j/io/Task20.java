package ru.job4j.io;

/*
Написать код, который выводит на экран в первой строке через пробел значения входящих переменных, во второй
― сумму этих переменных, в третьей - произведение этих переменных.
 */

import java.util.StringJoiner;

public class Task20 {

    public String systemPrintValue(int first, int second) {
        return String.format("Переменные: %s %s", first, second);
    }

    public String systemPrintSumValues(int first, int second) {
        return String.format("Сумма: %s", first + second);
    }

    public String systemPrintMultiValues(int first, int second) {
        return String.format("Произведение: %s", first * second);
    }

    public String systemPrintAll(int first, int second) {
        var stringJoiner = new StringJoiner("\n")
                .add(systemPrintValue(first, second))
                .add(systemPrintSumValues(first, second))
                .add(systemPrintMultiValues(first, second));
        return stringJoiner.toString();
    }
}