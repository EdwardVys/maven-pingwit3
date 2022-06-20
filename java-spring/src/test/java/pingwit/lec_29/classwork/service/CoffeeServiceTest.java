package pingwit.lec_29.classwork.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pingwit.lec_29.classwork.dto.CoffeeDto;
import pingwit.lec_29.classwork.model.Coffee;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CoffeeServiceTest {

    private final CoffeeMachineService coffeeMachineService = mock(CoffeeMachineService.class);
    private final CoffeeService subject = new CoffeeService(coffeeMachineService);

    @Test
    void orderCoffee() {
        //Given
        CoffeeDto coffeeDto = new CoffeeDto(Coffee.CAPPUCCINO, 700, Boolean.TRUE);

        String expected = "300ml LATTE with sugar  Mosfet";

        when(coffeeMachineService.makeCoffee(Coffee.CAPPUCCINO, 700, Boolean.TRUE)).thenReturn(expected);
        //When
        String actual = subject.orderCoffee(coffeeDto);
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void orderCoffeeAnyVolume() {

        //Given
        CoffeeDto coffeeDto = new CoffeeDto(Coffee.CAPPUCCINO, 700, Boolean.TRUE);
        String expected = "300ml LATTE with sugar";

        when(coffeeMachineService.makeCoffee(eq(Coffee.CAPPUCCINO), any(), eq(Boolean.TRUE))).thenReturn(expected);

        //When
        String actual = subject.orderCoffee(coffeeDto);

        //Then
        Assertions.assertEquals(expected, actual);
    }
}