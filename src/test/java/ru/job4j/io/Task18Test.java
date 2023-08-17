package ru.job4j.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task18Test {

    @Test
    public void whenCalculatingThePerimeter() {
        var task18 = new Task18();
        assertEquals(task18.findThePerimeter(5), "15.7");
    }

    @Test
    public void whenCalculatingCircumferenceOfACircle() {
        var task18 = new Task18();
        assertEquals(task18.findTheCircumferenceOfACircle(5), "31.4");
    }

    @Test
    public void whenCalculatingAreaOfCircle() {
        var task18 = new Task18();
        assertEquals(task18.findTheAreaOfACircle(5), "78.5");
    }
}