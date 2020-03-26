package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        int temp = 0;
        for (int i = 2; i <= finish; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    temp++;
                }
            }
            if (temp == 2) {
                count++;
            }
            temp = 0;
        }
        return count;
    }
}
