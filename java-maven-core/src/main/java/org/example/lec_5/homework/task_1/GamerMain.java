package org.example.lec_5.homework.task_1;

public class GamerMain implements ComputerInterFace {


    @Override
    public void power_on() {
        System.out.println("Power Led is on");
    }

    @Override
    public void power_off() {
        System.out.println("Power Led is off");

    }

    @Override
    public void reset() {
        System.out.println("System needs to be rebooted");
    }
}


