package org.example.lec_11.homework.task_3_4;

import java.util.ArrayList;

public class CollectOneAndTwo {
    public static void main(String[] args) {

        ArrayList collection1 =  new ArrayList();
        ArrayList collection2 = new ArrayList();
        boolean col1empti = collection1.isEmpty();
        boolean col2empti = collection2.isEmpty();
        if (col1empti || col2empti) {
            System.out.println("Одна из коллеций пустая.");
        } else
        collection1.removeAll(collection2); //удаляем из первой те,  кторые есть во второй

        collection1.retainAll(collection2); // оставляем в первой только те, которые есть во второй
      }
    }
