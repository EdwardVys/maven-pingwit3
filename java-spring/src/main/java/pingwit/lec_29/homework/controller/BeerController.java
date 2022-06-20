package pingwit.lec_29.homework.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pingwit.lec_29.homework.dto.BeerDto;
import pingwit.lec_29.homework.service.BeerService;

@RestController
@RequestMapping("/beer")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @PostMapping("/order")
    public String orderBeer(@RequestBody BeerDto beerDto) {
        return beerService.orderBeer(beerDto);
    }

}

