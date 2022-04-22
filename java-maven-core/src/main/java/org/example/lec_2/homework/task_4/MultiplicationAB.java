package org.example.lec_2.homework.task_4;

public class MultiplicationAB {
    public static void main(String[] args) {
        int a = 5;
        int b = -6;
        boolean isNegative = false;
        if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
            isNegative = true;
        }
        a = Math.abs(a);
        b = Math.abs(b);
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int result = 0;
        for (int i = 0; i < a; ++i) {
            result += b;
        }
        if (isNegative) {
            result = - result;
        }
        System.out.println(result);
    }
}
