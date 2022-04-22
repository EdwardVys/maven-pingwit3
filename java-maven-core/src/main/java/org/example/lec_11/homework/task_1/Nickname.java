package org.example.lec_11.homework.task_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Nickname {
    public static void main(String[] args) {
// не отрабатывает некорректно введенные пробелы  и цифры
        ArrayList<String> nickname = new ArrayList<>();

        nickname.add("Фига");
        nickname.add("Лома");
        nickname.add("Щавлик");
        nickname.add("Пончик");

        System.out.print("Вспомни детскую кликуху: ");
        Scanner name = new Scanner(System.in);
        String yourNickname = name.nextLine();

        if (nickname.contains(yourNickname)) {
            System.out.println(" Заходи дружище " + (yourNickname));
        } else {
            System.out.println(" Вспоминай.... или проваливай!!! " + (yourNickname));
        }
    }
}

