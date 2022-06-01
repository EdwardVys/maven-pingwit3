package pingwit.lec_21.converter;

import org.springframework.stereotype.Component;
import pingwit.lec_21.controller.CarController;
import pingwit.lec_21.dto.CarDto;
import pingwit.lec_21.entity.Car;

@Component
public class CarConverter {

    private CarController carController;
    public Car convert(CarDto carDto, Long id){
        return new Car(id, carDto.name(), carDto.number()); }
    }






