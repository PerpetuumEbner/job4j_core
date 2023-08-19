package ru.job4j.string;

public class Task49 {
    public String isPalindrome(int number) {
        String string = Integer.toString(number);
        int last = string.length();
        String result = "Да";

        for (int index = 0; index < last; index++) {
            if (string.charAt(index) != string.charAt(last - 1)) {
                result = "Нет";
                break;
            }
            last--;
        }
        return result;
    }
}