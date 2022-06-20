package pingwit.lec_29.homework.service;

import org.springframework.stereotype.Component;
import pingwit.lec_29.homework.menu.Beer;

@Component
public class BeerDeliveryService {

    public String deliveryBeer(Beer beer, Integer volume, Integer amount) {
        return volume + "ml " + beer + " " + amount + " ";
    }
}
