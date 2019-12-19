package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int numw = word.length-1;
        int nump = post.length-1;
        for ( ; nump > 0 ;numw--, nump--) {
            if (word[numw] != post[nump]) {
                result = false;
            }
        }
        return result;
    }
}