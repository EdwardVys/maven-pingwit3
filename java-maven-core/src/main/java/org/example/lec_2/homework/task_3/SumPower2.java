package org.example.lec_2.homework.task_3;

public class SumPower2 {
    public static void main(String[] arg) {
        int digit = 1;
        int sumpower = 0;
        while (digit <= 256) {
            sumpower = sumpower + digit;
            digit = digit * 2;
        }
        System.out.println(" Сумма степеней числа 2 равна  " + sumpower);
    }
}
