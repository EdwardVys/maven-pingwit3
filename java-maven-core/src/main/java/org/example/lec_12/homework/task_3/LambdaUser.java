package org.example.lec_12.homework.task_3;

public class LambdaUser {
    String lambdauser; // lambdauser -> lambdaUser

    public LambdaUser(String name) {

    }

    // метод main надо делать в отдельном классе
    public static void main(String[] args) {
        // в вашем решение вы вывели фразу на экран, а надо было создать пользователя
        Consumer<String> lambdauser = x -> System.out.println("Совсем уж неожиданно" + x + "!!!!!");
        lambdauser.accept(" - Егорка"); //НЕ ОБСУЖДАЕТСЯ!!!!!!
        
        /*
        Пример решения
        
        Function<String, LambdaUser> userSupplier = LambdaUser::new;

        LambdaUser egorka = userSupplier.apply("Egorka");
        System.out.println(egorka);
        */
    }
}


// такой интерфейс уже есть в джава, свой удаляйте.
// такой вариант не подойдет, т.к. метод возвращает void, а нам надо, чтобы он возвращал User
@FunctionalInterface
interface Consumer<T> {
    void accept(T t);
}
