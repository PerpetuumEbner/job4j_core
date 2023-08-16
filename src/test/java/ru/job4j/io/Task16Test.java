package ru.job4j.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task16Test {

    @Test
    public void eachSequenceOfSameSymbolsOnSeparateLine() {
        String source = "+!?";
        var task16 = new Task16();
        String result = task16.display(0, 3, source)
                + task16.display(1, 4, source)
                + task16.display(2, 2, source);

        String expected = "+++!!!!??";
        assertEquals(result, expected);
    }
}