package ru.job4j.io;

/*
Напишите класс, который присваивает переменной х значение 6, а затем выводит на экран: в первой строке ― это значение,
во второй ― квадрат этого значения, в третьей ― куб этого значения.
*/

public class Task17 {
    public String printValue(int value) {
        return value
                + "\n" + (int) Math.pow(value, 2)
                + "\n" + (int) Math.pow(value, 3);
    }
}