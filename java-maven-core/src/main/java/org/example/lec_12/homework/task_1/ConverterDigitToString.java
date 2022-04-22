package org.example.lec_12.homework.task_1;

public class ConverterDigitToString {
    public static void main(String[] args) {
        // Function<Integer, String> converter = x -> String.valueOf(x);
        // ==
        // Function<Integer, String> converter = String::valueOf;
        Function<Integer, String> Converter = x -> {
            return String.valueOf(x);
        };
        System.out.println(Converter.apply(66) + " рупий");
        
        // вы просто из числа 66 делаете строку "66" и добавляете рупий в System.out.println().
        // ваша функция как раз должна принимать 2 аргумента, а возвращать 1 
        // пример
        /*
        BiFunction<Integer, String, String> converter = (number, currency) -> number + " " + currency;
        String result = converter.apply(66, "рупий");

        System.out.println(result);
        */
    }
}

@FunctionalInterface
interface Function<T, R> { // вот прям точно такой же интерфейс есть в джаве, этот удаляйте
    R apply(T t);

    default void sayHi() {
    }
}
