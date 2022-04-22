package org.example.lec_3.homework.task_4;

import java.util.Arrays;

public class Multiplication2d { // не надо использовать цифры в названии класса
    public static void main(String[] arg) {
        int[][] array2d = new int[10][10];
        // Пашти рабатает!!!!
        // в целом норм работает
        for (int i = 1; i < array2d.length; i++) {
            for (int j = 1; j < array2d[i].length; j++) {
                array2d[i][j] = i * j;
            }
        }
        for (int i = 1; i < array2d.length; i++) {
            System.out.println(Arrays.toString(array2d[i]));
        }
    }
}

