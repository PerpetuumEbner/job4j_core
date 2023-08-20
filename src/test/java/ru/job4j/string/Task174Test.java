
package ru.job4j.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task174Test {

    @Test
    public void whenNumberIs44ThenTrue() {
        assertTrue(new Task174().isPalindrome(44));
    }

    @Test
    public void whenNumberIs37573ThenTrue() {
        assertTrue(new Task174().isPalindrome(37573));
    }

    @Test
    public void whenNumberIs45ThenFalse() {
        assertFalse(new Task174().isPalindrome(45));
    }

    @Test
    public void whenNumberIs11121ThenFalse() {
        assertFalse(new Task174().isPalindrome(11121));
    }

    @Test
    public void whenNumberIs4555ThenFalse() {
        assertFalse(new Task174().isPalindrome(4555));
    }

    @Test
    public void whenNumberIs30ThenFalse() {
        assertFalse(new Task174().isPalindrome(30));
    }

    @Test
    public void whenNumberIs37573ThenFalse() {
        assertFalse(new Task174().isPalindrome(-37573));
    }
}