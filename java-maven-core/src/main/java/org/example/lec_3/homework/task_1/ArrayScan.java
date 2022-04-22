package org.example.lec_3.homework.task_1;

import java.util.Scanner;

// ГУГЛ + JAVA РУЛЯТ!!!!! сплагиатил частично, когда выполнял таски 9 и 10 )))))
//+
public class ArrayScan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] input = new int[4];
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            System.out.println("Введите " + (i + 1) + " элемент массива:");
            input[i] = in.nextInt();
        }
        for (int num : input) {
            sum = sum + num;
        }
        System.out.println("Сумма элементов массива равна: " + sum);
        int max = input[0];
        for (int i = 1; i < input.length; i++) max = Math.max(max, input[i]);
        System.out.println("Максимальное значение равна: " + max);
        int min = input[0];
        for (int i = 1; i < input.length; i++) min = Math.min(min, input[i]);
        System.out.println("Минимальное значение равна: " + min);
    }
}










