package ru.job4j.array;


public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (word[i] >= post[i]) {
                i = word.length - post.length;
                result = false;
                break;
            }
        }
        return result;
    }
}
