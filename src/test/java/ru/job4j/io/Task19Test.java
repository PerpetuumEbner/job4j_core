package ru.job4j.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task19Test {

    @Test
    public void whenOutputNumber() {
        var task19 = new Task19();
        assertEquals(task19.systemPrintValue(9), "Значение x равно 9");
    }

    @Test
    public void whenOutputSquareNumber() {
        var task19 = new Task19();
        assertEquals(task19.systemPrintValueNumberSquared(9), "Значение x^2 равно 81");
    }
}