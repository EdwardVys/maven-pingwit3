package org.example.lec_4.homework.task_1_4;

import java.util.Objects;

public class Neighbor {
    private static String text;
    private String name;
    private Integer age;

    static {
        text = "Hello from static";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Neighbor neighbor = (Neighbor) o;
        return Objects.equals(name, neighbor.name) && Objects.equals(age, neighbor.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static String getText() {
        return text;
    }

    public Neighbor() {
        this("Oleg", 29);
    }

    public Neighbor(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static void setText(String text) {
        Neighbor.text = text;
    }

    public String toString() {
        return "Neighbor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    protected String showNameInf() {
        return name + " hi is " + age + " years old ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}












