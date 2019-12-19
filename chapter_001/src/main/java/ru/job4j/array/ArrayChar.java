package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for ( int num = 0 ; num < pref.length ;num++ ) {
            if (word[num] != pref[num]) {
                result = false;
            }
        }
        return result;
    }
}