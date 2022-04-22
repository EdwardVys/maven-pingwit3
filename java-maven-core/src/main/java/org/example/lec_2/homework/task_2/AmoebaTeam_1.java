package org.example.lec_2.homework.task_2;

// +, но достаточно одного решения
public class AmoebaTeam_1 {
    public static void main(String[] arg) {
        int amoeba, hour;
        amoeba = 1;
        for (hour = 0; hour <= 24; hour = hour + 3) {
            System.out.println("Прошло   " + hour + "  часа(ов),  а амеб стало - " + amoeba + "  шт");
            amoeba = amoeba * 2;
        }
    }
}

