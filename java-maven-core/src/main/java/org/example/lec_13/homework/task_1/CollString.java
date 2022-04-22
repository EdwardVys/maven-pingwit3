package org.example.lec_13.homework.task_1;

import java.util.ArrayList;
import java.util.List;

public class CollString {
    public static void main(String[] args) {
        List<String> scientificDevice = new ArrayList<>(6);
        scientificDevice.add("LPS");
        scientificDevice.add("Clamp");
        scientificDevice.add("Generator");
        scientificDevice.add("Tester");
        scientificDevice.add("Oscilloscope");
        scientificDevice.add("Loupe");

        System.out.println("Full set " + scientificDevice);

        List<String> longName = scientificDevice.stream()
                .filter(wordLength -> wordLength.length() >= 5)
                .toList();
       
        System.out.println("Sorted set " + longName);

    }
}
