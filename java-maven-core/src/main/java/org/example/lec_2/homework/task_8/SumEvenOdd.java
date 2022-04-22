package org.example.lec_2.homework.task_8;

public class SumEvenOdd {

    public static void main(String[] args) {
        int even, odd;
        int sum = 0; // sum - плохое название переменной, непонятно при данном задании сумма чего будет хранится
        int sum1 = 0; // sum1 - плохое название переменной
        int sum2 = 0; // sum2 - плохое название переменной
        for (even = 2; even <= 100; even = even + 2) {
            sum1 = sum1 + even;
        }
        System.out.println("Сумма четных чисел от 2 до 100  " + sum1);
        for (odd = 1; odd <= 100; odd = odd + 2) {
            sum2 = sum2 + odd;
        }
        System.out.println("Сумма нечетных чисел от 1 до 100  " + sum2);
        sum = sum1 + sum2;
        System.out.println("Общая сумма чисел от 1 до 100  " + sum);

    }
}


