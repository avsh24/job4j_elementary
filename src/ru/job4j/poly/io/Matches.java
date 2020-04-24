package ru.job4j.poly.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stick = 11;
        boolean run = true;
        boolean player1 = true;

        System.out.println("Игра 11.");
        System.out.println("На столе лежат 11 спичек.\n"
                + "Два игрока по очереди берут от 1 до 3 спичек.\n"
                + "Выигрывает тот, кто забрал последние спички.");
        System.out.println();

        while (run) {
            System.out.println("Осталось спичек: " + stick);
            if (player1) {
                player1 = false;
                System.out.print("Первый игрок, тяни спички: ");
            } else {
                player1 = true;
                System.out.print("Второй игрок, тяни спички: ");
            }
            int select = Integer.parseInt(input.nextLine());
            stick -= select;
            if (stick <= 0) {
                if (player1) {
                    System.out.println("Второй победил");
                } else {
                    System.out.println("Первый победил");
                }
                run = false;
            }
        }
    }
}
