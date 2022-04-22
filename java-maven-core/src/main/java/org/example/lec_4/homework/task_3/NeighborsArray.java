package org.example.lec_4.homework.task_3;

import com.example.lec_4.homework.task_1_4.Neighbor;

public class NeighborsArray {
    public static void main(String[] args) {

        Neighbor[] neighbor = new Neighbor[]{
                new Neighbor("Oleg", 29),
                new Neighbor("Nikolay", 36),
                new Neighbor("Pol", 20),
                new Neighbor("Igor", 48),
        };
    }
}
// массив то создал, да вот только с эквиал...опять затык....

// вам нужно переопределить методы equals/hashcode в классе Neighbor и затем при помощи цикла найти повторения
// скорее всего вариант ниже вам подойдет:



