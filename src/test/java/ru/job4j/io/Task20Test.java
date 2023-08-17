package ru.job4j.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task20Test {

    @Test
    public void whenPrintNumbers() {
        var task20 = new Task20();
        assertEquals(task20.systemPrintValue(5, 6), "Переменные: 5 6");
    }

    @Test
    public void whenPrintSumNumbers() {
        var task20 = new Task20();
        assertEquals(task20.systemPrintSumValues(5, 6), "Сумма: 11");
    }

    @Test
    public void whenPrintMultiNumbers() {
        var task20 = new Task20();
        assertEquals(task20.systemPrintMultiValues(5, 6), "Произведение: 30");
    }

    @Test
    public void whenPrintAll() {
        var task20 = new Task20();
        task20.systemPrintAll(2, 6);
        String result = """
                Переменные: 2 6
                Сумма: 8
                Произведение: 12""";
        assertEquals(task20.systemPrintAll(2, 6), result);
    }
}