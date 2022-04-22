package org.example.lec_11.homework.task_2;

import java.util.ArrayList;
import java.util.Iterator;

public class IntArrayList100 {
    public static void main(String[] args) {
        ArrayList<Integer> intarraylist = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            intarraylist.add(0, i);
        }
        System.out.println(intarraylist);

        /*
        еще можно было так
        intarraylist.removeIf(x -> x % 2 == 0);
        */
        Iterator<Integer> iterator = intarraylist.iterator();
        while (((Iterator<?>) iterator).hasNext()) { // ((Iterator<?>) iterator).hasNext() -> iterator.hasNext() скорее всего будет достаточно
            int nextValue = iterator.next();
            if (nextValue % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(intarraylist);
    }
}







