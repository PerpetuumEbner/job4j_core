package ru.job4j.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task15Test {

    @Test
    public void eachSequenceOfSameSymbolsOnSeparateLine() {
        String source = "+!?";
        var task15 = new Task15();
        String result = task15.display(0, 3, source)
                + task15.display(1, 4, source)
                + task15.display(2, 2, source);

        String expected = """
                +++
                !!!!
                ??""";
        assertEquals(result, expected);
    }
}