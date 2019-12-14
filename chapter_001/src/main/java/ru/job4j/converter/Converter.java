package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }


    public static void main(String[] args) {
//        int euro = rubleToEuro(140);
//        System.out.println("140 rubles are " + euro + " euro.");
//        int dollar = rubleToDollar(140);
//        System.out.println("140 rubles are " + dollar + " dollar.");
//        int ruble = euroToRuble(10);
//        System.out.println("10 euro are " + ruble + " rubles.");
//        ruble = dollarToRuble(20);
//        System.out.println("20 dollar are " + ruble + " rubles.");
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 2 dollar. Test result : " + passed);

        in = 10;
        expected = 700;
        out = euroToRuble(in);
        passed = expected == out;
        System.out.println("10 euro are 700 rubles. Test result : " + passed);

        in = 20;
        expected = 1200;
        out = dollarToRuble(in);
        passed = expected == out;
        System.out.println("20 dollar are 1200 rubles. Test result : " + passed);
    }
}