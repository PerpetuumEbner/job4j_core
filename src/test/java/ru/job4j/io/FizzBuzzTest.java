package ru.job4j.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    public void whenNumberIsMultipleOfThree() {
        var fizzBuzz = new FizzBuzz();
        assertArrayEquals(fizzBuzz.fizzBuzz(3), "Fizz".getBytes());
    }

    @Test
    public void whenNumberIsMultipleOfFive() {
        var fizzBuzz = new FizzBuzz();
        assertArrayEquals(fizzBuzz.fizzBuzz(5), "Buzz".getBytes());
    }

    @Test
    public void whenNumberIsMultipleOfThreeAndFive() {
        var fizzBuzz = new FizzBuzz();
        assertArrayEquals(fizzBuzz.fizzBuzz(15), "FizzBuzz".getBytes());
    }

    @Test
    public void whenThereIsNoMatch() {
        var fizzBuzz = new FizzBuzz();
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.fizzBuzz(1));
    }
}