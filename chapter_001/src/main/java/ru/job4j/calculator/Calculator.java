package ru.job4j.calculator;

/**
 * Class для вычисления арифметических операций + = * /.
 * @author AlekseevArtem (tema9991@mail.ru)
 * @since  08.12.2019
 * @version  1
 */
public class Calculator {
    /**
     * Сложение.
     * @param  first первый аргумент
     * @param  second первый аргумент
     * @return  result результат
     */
    public static void add(double first, double second) {
        double result =  first + second;
        System.out.println(first + "+" + second + " = " + result);
    }

    /**
     * Деление.
     * @param  first первый аргумент
     * @param  second первый аргумент
     * @return  result результат
     */
    public static void div(double first, double second) {
        double result =  first / second;
        System.out.println(first + "/" + second + " = " + result);
    }

    /**
     * Умножение.
     * @param  first первый аргумент
     * @param  second первый аргумент
     * @return  result результат
     */
    public static void multiply(double first, double second) {
        double result =  first * second;
        System.out.println(first + "*" + second + " = " + result);
    }

    /**
     * Вычитание.
     * @param  first первый аргумент
     * @param  second первый аргумент
     * @return  result результат
     */
    public static void substract(double first, double second) {
        double result =  first - second;
        System.out.println(first + "-" + second + " = " + result);
    }

    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        substract(10, 5);

    }
}