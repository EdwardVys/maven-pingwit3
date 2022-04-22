package org.example.lec_13.homework.task_2;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StringMaxLength {
    public static void main(String[] args) {
        List<String> scientificDevice = new ArrayList<>(6);
        scientificDevice.add("LPS");
        scientificDevice.add("Clamp");
        scientificDevice.add("Generator");
        scientificDevice.add("Tester");
        scientificDevice.add("Oscilloscope");
        scientificDevice.add("Loupe");

        System.out.println("Full set " + scientificDevice);

        Optional<String> maxName = scientificDevice.stream()
                .max(Comparator.comparingInt(String::length));
        maxName.ifPresent(item -> System.out.println("Longest name " + item));
    }
}
