package org.example.lec_2.homework.task_2;

public class AmoebaTeam {
    public static void main(String[] arg) {
        int hours = 0;
        int amoeba = 1;
        do {
            System.out.println("Прошло   " + hours + "  часа(ов),  а амеб стало - " + amoeba + "  шт");
            hours = hours + 3;
            amoeba = amoeba * 2;
        }
        while (hours <= 24);
    }
}
