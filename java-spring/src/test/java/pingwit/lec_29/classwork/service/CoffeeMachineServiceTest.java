package pingwit.lec_29.classwork.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pingwit.lec_29.classwork.model.Coffee;

class CoffeeMachineServiceTest {

    private final CoffeeMachineService subject = new CoffeeMachineService();

    @Test
    void makeCoffeeWithSugar() {

        //Given
        Coffee coffee = Coffee.LATTE;
        Integer volume = 300;
        Boolean sugar = Boolean.TRUE;
        String expected = "300ml LATTE with sugar";

        //When
        String actual = subject.makeCoffee(coffee, volume, sugar);

        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void makeCoffeeWithoutSugar() {

        //Given
        Coffee coffee = Coffee.LATTE;
        Integer volume = 300;
        Boolean sugar = Boolean.FALSE;
        String expected = "300ml LATTE without sugar";

        //When
        String actual = subject.makeCoffee(coffee, volume, sugar);

        //Then
        Assertions.assertEquals(expected, actual);
    }
}