package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumMinusAndDivide(double first, double second) {
        return sum(minus(first, second), divide(first, second));
    }

    public static double sumAllOperations(double first, double second) {
        return sum(sum(sum(first, second), minus(first, second)),
                sum(multiply(first, second), divide(first, second)));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply(10, 20) равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета sumMinusAndDivide(10, 20) равен: " + sumMinusAndDivide(10, 20));
        System.out.println("Результат расчета sumAllOperations(10, 20) равен: " + sumAllOperations(10, 20));

    }
}