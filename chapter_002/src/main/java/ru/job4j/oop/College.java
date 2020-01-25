package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman newbie = new Freshman();
        Student notNewbie = newbie;          // понижающее приведение.
        Object guy = notNewbie;             // понижающее приведение.
    }
}
