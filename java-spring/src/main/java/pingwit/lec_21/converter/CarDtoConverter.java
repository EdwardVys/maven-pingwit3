package pingwit.lec_21.converter;

import pingwit.lec_21.entity.Car;
import pingwit.lec_21.dto.CarDto;

public class CarDtoConverter {
    private final UserConverter userConverter;

    public CarDtoConverter(UserConverter userConverter) {
        this.userConverter = userConverter;
    }

    public CarDto convert(Car car) {
        return new CarDto(car.name(), car.number());

    }
}
