package ru.job4j.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task49Test {

    @Test
    public void whenNumberIs44ThenYes() {
        assertEquals(new Task49().isPalindrome(44), "Да");
    }

    @Test
    public void whenNumberIs37573ThenYes() {
        assertEquals(new Task49().isPalindrome(37573), "Да");
    }

    @Test
    public void whenNumberIs45ThenNo() {
        assertEquals(new Task49().isPalindrome(45), "Нет");
    }

    @Test
    public void whenNumberIs11121ThenNo() {
        assertEquals(new Task49().isPalindrome(11121), "Нет");
    }

    @Test
    public void whenNumberIs4555ThenNo() {
        assertEquals(new Task49().isPalindrome(4555), "Нет");
    }

    @Test
    public void whenNumberIs100ThenNo() {
        assertEquals(new Task49().isPalindrome(100), "Нет");
    }
}