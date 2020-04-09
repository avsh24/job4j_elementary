package ru.job4j.array;


public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - post.length + i] != post[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
