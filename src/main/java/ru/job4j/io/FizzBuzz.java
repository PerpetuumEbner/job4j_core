package ru.job4j.io;

public class FizzBuzz {
    public byte[] fizzBuzz(int value) {
        String string = "";
        if (value % 3 == 0) {
            string += "Fizz";
        }
        if (value % 5 == 0) {
            string += "Buzz";
        }
        if (string.isEmpty()) {
            throw new IllegalArgumentException("Not implemented yet");
        }
        return string.getBytes();
    }
}