package org.example.lec_12.homework.task_2;

public class MultiplyInt {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (x, y) -> x * y;

        System.out.println(multiply.apply(45, 99));
    }
}

// BinaryOperator уже есть в джава, свой удаляйте
interface BinaryOperator<T> {
    T apply(T t1, T t2);

    private void test() {
    }
}
