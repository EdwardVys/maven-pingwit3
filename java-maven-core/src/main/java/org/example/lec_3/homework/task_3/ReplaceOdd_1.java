package org.example.lec_3.homework.task_3;

import java.util.Arrays;

// программа работает некорректно
public class ReplaceOdd_1 {
    public static void main(String[] arg) {
        // заменяем нечетные элементы
        int[] bigarray = new int[]{33, 45, 55, 88, 4, 78, 23, 44, 67, 99, 98};
        System.out.println(Arrays.toString(bigarray));
        for (int i = 0; i < bigarray.length; i++) {
            if (bigarray[i] % 2 == 1) {
                bigarray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(bigarray));
    }
}

