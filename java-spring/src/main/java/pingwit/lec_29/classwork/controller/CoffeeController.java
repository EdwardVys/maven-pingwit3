package pingwit.lec_29.classwork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pingwit.lec_29.classwork.dto.CoffeeDto;
import pingwit.lec_29.classwork.model.Coffee;
import pingwit.lec_29.classwork.service.CoffeeService;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {

    private final CoffeeService coffeeService;

    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @PostMapping("/order")
    public String orderCoffee(@RequestBody CoffeeDto coffeeDto) {
        return coffeeService.orderCoffee(coffeeDto);
    }

    @GetMapping("/order/daily")
    public String daily() {
        return Coffee.LATTE.name();
    }

}
