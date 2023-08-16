package ru.job4j.io;

/**
 * Напишите класс, который выводит на экран последовательно три знака «+», четыре знака «!», два знака «?».
 */

public class Task16 {

    public String display(int index, int repetitions, String string) {
        StringBuilder result = new StringBuilder();
        char[] chars = string.toCharArray();
        int count = 0;
        while (count < repetitions) {
            result.append(chars[index]);
            count++;
        }
        return result.toString();
    }
}
