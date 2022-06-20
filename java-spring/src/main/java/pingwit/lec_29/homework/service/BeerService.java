package pingwit.lec_29.homework.service;

import org.springframework.stereotype.Service;
import pingwit.lec_29.homework.dto.BeerDto;

@Service
public class BeerService {

    private final BeerDeliveryService beerDeliveryService;

    public BeerService(BeerDeliveryService beerDeliveryService) {
        this.beerDeliveryService = beerDeliveryService;
    }

    public String orderBeer(BeerDto dto) {
        return beerDeliveryService.deliveryBeer(dto.beer(), dto.volume(), dto.amount());
    }
}

