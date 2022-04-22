package org.example.lec_11.homework.task_9;

import java.util.TreeSet;

public class TreeSetStudent {
    public static void main(String[] args) {
        // нуебходимо было создать класс Student и затем создать TreeSet<Student>. Целью задания было использовать интерфейс Comparable<Student>
        TreeSet<String> student = new TreeSet<>();

        student.add("Egorka");
        student.add("Olga");
        student.add("Ivanov");
        student.add("Petrov");
        student.add("Sidorov");
        student.add("Fedorov");

        System.out.println(student);
    }
}
