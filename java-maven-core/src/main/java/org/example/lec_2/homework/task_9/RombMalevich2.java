package org.example.lec_2.homework.task_9;

//плагиатнул у Кати((((((.... и надо еще доработать!!!!
// подсматривать у других можно, главное разобраться почему так, а не просто скопировать. 
// ну и печатают они пока не совсем верно
public class RombMalevich2 {
    public static void main(String[] args) {

        for (int outer = 1; outer <= 4; outer++) {
            for (int sign = 4; sign >= outer; sign--) {
                System.out.print("*");
            }
            for (int space = 1; space <= outer; space++) {
                System.out.print(" ");
            }
            System.out.println();
        }

// эту строку стит удалить, 2 абзаца подряд не нужно
        for (int outer = 1; outer <= 4; outer++) {
            for (int sign = 1; sign <= outer; sign++) {
                System.out.print("*");
            }
            for (int space = 1; space <= outer; space++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

