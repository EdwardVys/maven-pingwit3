package pingwit.lec_29.classwork.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pingwit.lec_29.classwork.dto.CoffeeDto;
import pingwit.lec_29.classwork.model.Coffee;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;


@ExtendWith(SpringExtension.class)
public class CoffeeServiceTestV2 {
    @Mock
    private CoffeeMachineService coffeeMachineService;
    @InjectMocks
    private CoffeeService subject;

    @Test
    void orderCoffee() {
        //Given
        CoffeeDto coffeeDto = new CoffeeDto(Coffee.CAPPUCCINO, 700, Boolean.TRUE);

        String expected = "300ml LATTE with sugar";

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
