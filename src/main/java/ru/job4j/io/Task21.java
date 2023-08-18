package ru.job4j.io;

/*
 * Напишите класс, который выводит на экран в одной строке ваше фамилию, имя, отчество , в другой ― телефон,
 * все это ― в рамке из «звездочек».
 */

public class Task21 {

    public String systemPrintFormat(String name, String number) {
        return String.format("""
                        ************************
                        * %s *
                        * %s     *
                        ************************
                        """,
                name, number);
    }
}