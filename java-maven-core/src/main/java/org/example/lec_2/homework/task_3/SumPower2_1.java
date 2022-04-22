package org.example.lec_2.homework.task_3;

public class SumPower2_1 {
    public static void main(String[] arg) {
        int digit = 1;
        int sumpower = 0;
        for (digit = 1; digit <= 256; digit = digit * 2)
            sumpower = sumpower + digit;
        System.out.println(" Сумма степеней числа 2 равна  " + sumpower);
    }
}


