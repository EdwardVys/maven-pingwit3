package org.example.lec_2.homework.task_5;

public class InchTosm {
    public static void main(String[] args) {
       double sm;
       for (float inches = 1; inches <= 20; inches = inches + 1) {
           sm = inches * 2.54;
           System.out.println(inches + " | " + sm);
        }
    }
    
    // вот так чуть красивее будет. Создание Переменной inches в цикл, а базовое значение sm = 1.0F; можно не присваивать, т.к. первой строкой в цикле это делается
    // не стоит вообще ручками использовать class cast -> sm = (float) (inches * 2.54); - когда-нибдь это может поломать результат программы
    /*    
    public static void main(String[] args) {
        double sm;
        for (float inches = 1; inches <= 20; inches = inches + 1) {
            sm = inches * 2.54;
            System.out.println(inches + " | " + sm);
        }
    }
    }*/
}
//Соглпсен так красише и лаконичнее....
