package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        for (int i = 0; i < word.length; i++) {
                if (word[i] == pref[i]) {
                    return true;
                }
        }
        return result;
    }
}
