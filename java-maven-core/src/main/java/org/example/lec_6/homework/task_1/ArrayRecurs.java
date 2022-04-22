package org.example.lec_6.homework.task_1;

public class ArrayRecurs {
    public static void main(String[] args) {
        int [] array = {3,7,9,12,6,22};

        printArray(array, 0);
    }
    private static void printArray(int[] array, int pos) {
        if (pos >= array.length) {
            return;
        }
        System.out.println(array[pos]);
        printArray(array,pos + 1);
    }
}


