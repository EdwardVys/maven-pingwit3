package pingwit.lec_29.classwork.service;

import org.springframework.stereotype.Component;
import pingwit.lec_29.classwork.model.Coffee;

@Component
public class CoffeeMachineService {

    public String makeCoffee(Coffee coffee, Integer volume, Boolean sugar) {
        return volume + "ml " + coffee + " " + sugar(sugar);
    }

    private String sugar(Boolean sugar) {
        if (sugar) {
            return "with sugar";
        } else {
            return "without sugar";
        }
    }

}
