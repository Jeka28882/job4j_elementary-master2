package ru.job4j.calkulator;

import static ru.job4j.math.MathFunction.*;


public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double dvAndMut(double first, double second) {
        return dvide(first, second)
                + multer(first, second);
    }

    public static double sumAlFunction(double first, double second) {
        return sumAndMultiply(first, second)
                + dvAndMut(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + dvAndMut(10, 20));
        System.out.println("Результат расчета равен: " + sumAlFunction(10, 20));
    }
}