package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc)  && (ab + bc > ac)  && (ac + bc > ab);
    }
}

