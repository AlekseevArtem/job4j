package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int turn = 1;
        int matches = 11;
        System.out.println("На столе лежат " + matches + " спичек. Два игрока по очереди берут от 1 до 3 спичек. Выигрывает тот, кто забрал последние спички.");
        System.out.print("Первый игрок, вы ходите первым. Напишите количество спичек которое вы берёте: ");
        while (run) {
            int select = Integer.parseInt(input.nextLine());
            if (select == 3 && matches >= 3) {
                matches -= 3;
            } else if (select == 2 && matches >= 2) {
                matches -= 2;
            } else if (select == 1) {
                matches -= 1;
            } else {
                System.out.println("Игрок " + (turn % 2 + 1)  + " вы не можете взять столько спичек. Спичек осталось " + matches);
                continue;
            }
            if (matches == 0) {
                System.out.println("Поздравляем " + (turn % 2 + 1)  + " игрока с победой на " + turn + " ходу.");
                run = false;
            } else {
                turn++;
                System.out.println("Спичек осталось " + matches + ". Ход " + (turn % 2 + 1) + " игрока:");
            }
        }
    }
}
