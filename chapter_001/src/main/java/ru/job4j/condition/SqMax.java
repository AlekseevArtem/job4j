package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second && first > third && first > forth) {
            result = first;
        } else if (second > third && second > forth) {
            result = second;
        } else if (third > forth) {
            result = third;
        }

        return result;
    }

    public static void main(String[] args) {
        int result = max(11, 1, 1, 5);
        System.out.println(" expect 11, real = " + result);

        int result1 = max(2, 1, 1, 5);
        System.out.println(" expect 5, real = " + result1);

        int result2 = max(6, 5, 8, 7);
        System.out.println(" expect 8, real = " + result2);

        int result3 = max(1, 1, 1, 9);
        System.out.println(" expect 9, real = " + result3);

        int result4 = max(6, 6, 6, 6);
        System.out.println(" expect 6, real = " + result4);
    }
}