package ru.job4j.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task17Test {

    @Test
    public void whenValueEqualsSixAndSystemPrint() {
        var task17 = new Task17();
        int value = 6;
        String result = value
                + "\n" + (int) Math.pow(value, 2)
                + "\n" + (int) Math.pow(value, 3);
        assertEquals(result, task17.printValue(value));
    }
}