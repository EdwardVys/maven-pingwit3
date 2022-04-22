package org.example.lec_4.homework.task_1_4;

public class NeighborMain {
    public static void main(String[] arg) {
        Neighbor oleg = new Neighbor("Oleg", 29);
        Neighbor igor = new Neighbor("Igor", 48);
        Neighbor nik = new Neighbor("Nikolay", 36);

        System.out.println(oleg);
        System.out.println(igor);

        System.out.println(oleg.showNameInf());
        System.out.println(igor.showNameInf());
        System.out.println(nik.showNameInf());

    }
}
