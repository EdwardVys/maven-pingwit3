package org.example.lec_2.homework.task_7;

// +
public class OutSumOdd {
    public static void main(String[] args) {
        int i, sum; // каждую переменную с новой строки
        sum = 0; // это можно было сделать сразу при создании переменной
        for (i = 1; i <= 100; i = i + 2) {
            sum = sum + i;
        }
        System.out.println("Сумма нечетных чисел от 1 до 100  " + sum);
    }
}

