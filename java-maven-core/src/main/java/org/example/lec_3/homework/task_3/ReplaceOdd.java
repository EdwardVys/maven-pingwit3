package org.example.lec_3.homework.task_3;

import java.util.Arrays;

//заменяем  элементы с нечетными индексами
// заменять необходимо не по индексу, а по значению элемента, т.е. массив [1,2,3] заменить на [0,2,0]
public class ReplaceOdd {
    public static void main(String[] arg) {
        int[] bigarray = new int[]{33, 45, 55, 88, 4, 78, 23, 44, 67, 99, 98}; // bigarray -> bigArray
        System.out.println(Arrays.toString(bigarray));
        for (int i = 0; i < bigarray.length; i++) {
            if (i % 2 == 1) {
                bigarray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(bigarray));
    }
}

