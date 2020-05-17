package ru.job4j.encapsulation.tracker;

import java.util.Scanner;

public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public int askInt(String question, int max) {
        int select = askInt(question);
        if (select >= 0 && select < max) {
            return select;
        } else {
            throw new IllegalStateException(String.format("Out of about % > [0, %s]", select, max));
        }
    }

    @Override
    public String askStr(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }
}
