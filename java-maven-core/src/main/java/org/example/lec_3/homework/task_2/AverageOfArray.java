package org.example.lec_3.homework.task_2;

import java.util.Arrays;

public class AverageOfArray {
    public static void main(String[] arg) {
        int[] digit = new int[]{33, 45, 55, 88,}; // перед второй фигурной скобкой лишняя запятая
        System.out.println(Arrays.toString(digit));
        double average = 0;
        for (int i = 0; i < 4; i++) { // 4 стоит заменить на digit.length
            average += digit[i];
        }
        average /= 4;
        System.out.println("Среднее арифметическое элементов массива равно: " + average);
    }
}
