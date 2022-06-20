package pingwit.lec_29.homework.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pingwit.lec_29.homework.dto.BeerDto;
import pingwit.lec_29.homework.menu.Beer;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BeerServiceTest {


    private final BeerDeliveryService beerDeliveryService = mock(BeerDeliveryService.class);

    private final BeerService subject = new BeerService(beerDeliveryService);

    @Test
    void orderBeer() {
        //Given
        BeerDto beerDto = new BeerDto(Beer.KELLERBIER, 500, 10);

        String expected = "Vot sho hosh";

        when(beerDeliveryService.deliveryBeer(Beer.KELLERBIER, 500, 10)).thenReturn(expected);
        //When
        String actual = subject.orderBeer(beerDto);
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void orderBeerAnyVolume() {
        //Given
        BeerDto beerDto = new BeerDto(Beer.KELLERBIER, 500, 10);

        String expected = "500ml KELLERBIER 10";

        when(beerDeliveryService.deliveryBeer(eq(Beer.KELLERBIER), any(), eq(10))).thenReturn(expected);
        //When
        String actual = subject.orderBeer(beerDto);
        //Then
        Assertions.assertEquals(expected, actual);
    }

}
