package org.example.lec_3.homework.task_5;

import java.util.Arrays;

public class InvertArray {
    public static void main(String[] arg) {
        int[] smalarray = new int[]{33, 45, 55, 88, 4,}; // smallarray -> smallArray
        System.out.println(Arrays.toString(smalarray));
        for (int i = 0; i < smalarray.length; i++) ; // зачем эта строка?
        int n = smalarray.length; // переменная n выглядит лишней
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = smalarray[n - i - 1];
            smalarray[n - i - 1] = smalarray[i];
            smalarray[i] = temp;
        }
        System.out.println(Arrays.toString(smalarray));
        for (int i = 0; i < smalarray.length; i++) ; // зачем эта строка?
    }
}




