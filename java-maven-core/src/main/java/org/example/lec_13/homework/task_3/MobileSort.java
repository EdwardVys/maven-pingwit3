package org.example.lec_13.homework.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MobileSort {
    public static void main(String[] args) {
        List<Mobile> mobile = new ArrayList<>();
        mobile.add(new Mobile("Nokia", "2210"));
        mobile.add(new Mobile("Apple", "Iphone 5S"));
        mobile.add(new Mobile("Samsung", "Galaxy S21"));
        mobile.add(new Mobile("Huawei", "P 20 lite "));
        mobile.add(new Mobile("Xiaomi", "Redmi Note 8"));
        mobile.add(new Mobile("Meizu", "M6"));

        System.out.println(mobile);

        Set<String> producers = mobile.stream()
                .map(Mobile::producer)
                .collect(Collectors.toSet());
        System.out.println(producers);

       Set<String> uniqueProducers = Set.of("Apple", "Samsung", "Xiaomi");
    //   newSet -> uniqueProducers; // не стоит забивать на название переменных

    //    Чуток не доделали. Решение
     /*   List<String> filteredProducers = mobile.stream()
                .map(Mobile::producer)
                .filter(producer -> uniqueProducers.contains(producer))
                .collect(Collectors.toList());
       
       System.out.println(producers);
*/
        System.out.println(uniqueProducers);

    }
}
// походу опять что то не то получилось....(((((
