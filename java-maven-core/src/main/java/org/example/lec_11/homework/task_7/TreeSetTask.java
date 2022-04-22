package org.example.lec_11.homework.task_7;

import java.util.TreeSet;


public class TreeSetTask {
    public static void main(String[] args) {
        TreeSet<Integer> treetask = new TreeSet<Integer>();
        TreeSet<Integer> reversetreetask = new TreeSet<Integer>();

        treetask.add(14);
        treetask.add(8);
        treetask.add(5);
        treetask.add(11);
        treetask.add(55);
        treetask.add(97);

        System.out.println(treetask);

        reversetreetask = (TreeSet) treetask.descendingSet();

        System.out.println(reversetreetask);
    }
}
