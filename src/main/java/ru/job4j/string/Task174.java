package ru.job4j.string;

public class Task174 {
    public static void main(String[] args) {
        System.out.println(new Task174().isPalindrome(37573));
        System.out.println(new Task174().isPalindrome(11121));
        System.out.println(new Task174().isPalindrome(0));
        System.out.println(new Task174().isPalindrome(30));
        System.out.println(new Task174().isPalindrome(-37573));
    }

    public boolean isPalindrome(int number) {
        int reversNumber = 0;
        int copyNumber = number;

        if (number % 10 == 0 && number != 0 || number < 0) {
            return false;
        }

        while (copyNumber != 0) {
            reversNumber = reversNumber * 10 + copyNumber % 10;
            copyNumber = copyNumber / 10;
        }
        return number == reversNumber;
    }
}