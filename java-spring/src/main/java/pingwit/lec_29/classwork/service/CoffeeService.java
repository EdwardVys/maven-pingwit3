package pingwit.lec_29.classwork.service;

import org.springframework.stereotype.Service;
import pingwit.lec_29.classwork.dto.CoffeeDto;

@Service
public class CoffeeService {

    private final CoffeeMachineService coffeeMachineService;

    public CoffeeService(CoffeeMachineService coffeeMachineService) {
        this.coffeeMachineService = coffeeMachineService;
    }

    public String orderCoffee(CoffeeDto dto) {
        return coffeeMachineService.makeCoffee(dto.coffee(), dto.volume(), dto.sugar());
    }
}
