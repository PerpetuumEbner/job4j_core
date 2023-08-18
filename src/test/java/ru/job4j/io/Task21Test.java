package ru.job4j.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task21Test {

    @Test
    public void whenSystemPrintFormat() {
        var task21 = new Task21();
        String expected = """
                ************************
                * Фамилия Имя Отчество *
                * +7 938 123 45 67     *
                ************************
                """;
        String result = task21.systemPrintFormat(
                "Фамилия Имя Отчество",
                "+7 938 123 45 67");
        assertEquals(result, expected);
    }
}