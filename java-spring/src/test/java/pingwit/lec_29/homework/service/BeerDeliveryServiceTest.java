package pingwit.lec_29.homework.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pingwit.lec_29.homework.menu.Beer;

class BeerDeliveryServiceTest {

    private final BeerDeliveryService subject = new BeerDeliveryService();

    @Test
    void deliveryBeer() {
        //Given
        Beer beer = Beer.PILSNER;
        Integer volume = 500;
        Integer amount = 10;

        String expected = "500ml PILSNER 10";

        //When
        String actual = subject.deliveryBeer(beer, volume, amount);

        //Then
        Assertions.assertEquals(expected, actual);
    }
}


