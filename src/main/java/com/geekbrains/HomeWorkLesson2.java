package com.geekbrains;

public class HomeWorkLesson2 {

    public static void main(String[] args) {
        boolean resultComp = compareSumOfInt(7, 8);
        System.out.println(resultComp + " (7+8)");
        System.out.println(compareSumOfInt(10, 20) + " (10+20)");
        numberIsPositive(0);
        numberIsPositive(-10);
        numberIsPositive(100);
        System.out.println(numbIsPositive(20) + " (20)");
        System.out.println(numbIsPositive(-20) + " (-20)");
        stringPrintRepeat(5, "Строка для печати");
        System.out.println("2000 високосный? " + yearIsViso(2000));
        System.out.println("2100 високосный? " + yearIsViso(2100));
        System.out.println("2400 високосный? " + yearIsViso(2400));
        System.out.println("2020 високосный? " + yearIsViso(2020));
        System.out.println("2021 високосный? " + yearIsViso(2021));
        System.out.println("2022 високосный? " + yearIsViso(2022));
        System.out.println("2024 високосный? " + yearIsViso(2024));
    }

    // сравнение суммы двух чисел
    public static boolean compareSumOfInt(int firstInt, int secondInt) {
        return (firstInt + secondInt) >= 10 && (firstInt + secondInt) <= 20;
    }

    // определение числа на положительное/отрицательное
    public static void numberIsPositive(int numInt) {
        if (numInt >= 0) {
            System.out.println("Переданное число положительное (" + numInt + ")");
        } else {
            System.out.println("Переданное число отрицательное (" + numInt + ")");
        }
    }

    // определение числа на положительное/отрицательное
    public static boolean numbIsPositive(int numInt) {
        return numInt >= 0;
    }

    // печать строки в консоль указанное количество раз
    public static void stringPrintRepeat(int numRepeat, String string) {
        for (int i = 0; i < numRepeat; i++) {
            System.out.println(string + "(" + (i + 1) + ")");
        }
    }

    // определяет високосность года, ответ - да/нет
    public static boolean yearIsViso(int yearNum) {
        if (yearNum % 4 == 0 && yearNum % 100 == 0 && yearNum % 400 == 0) {
            return true;
        } else if (yearNum % 4 == 0 && yearNum % 100 == 0 && yearNum % 400 != 0) {
            return false;
        } else if (yearNum % 4 == 0) {
            return true;
        } else {
            return false;
        }
        //return yearNum % 400 == 0 || (yearNum % 4 == 0 && yearNum % 100 != 0);
    }
}
