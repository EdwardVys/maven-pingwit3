package org.example.lec_2.homework.task_1;

public class RunningMan {
    public static void main(String[] arg) {
        byte amountDays = 1;
        float distanceDays = 10; // можно использовать double
        float distanceInc = 0.1F;
        float sumDistance = 0.0F;
        do {
            sumDistance = sumDistance + distanceDays;
            System.out.println("Бегун намотал за " + amountDays + "-й день   " + distanceDays + "  километров");
            distanceDays = distanceDays + distanceDays * distanceInc;
            amountDays += 1;
        } while (amountDays <= 7);
        System.out.println("А вааще бегун накрутил  " + sumDistance + "  км");
    }
}


