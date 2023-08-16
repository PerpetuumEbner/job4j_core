package ru.job4j.io;

/**
 * Напишите класс, который выводит на экран в первой строке три знака «+», во второй ― четыре знака «!», в третьей ― два знака «?».
 */

public class Task15 {

    public String display(int index, int repetitions, String string) {
        StringBuilder result = new StringBuilder();
        char[] chars = string.toCharArray();
        int count = 0;
        while (count < repetitions) {
            result.append(chars[index]);
            count++;
        }
        if (index < chars.length - 1) {
            result.append("\n");
        }
        return result.toString();
    }
}