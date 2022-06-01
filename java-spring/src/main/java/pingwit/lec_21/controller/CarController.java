package pingwit.lec_21.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pingwit.lec_21.converter.CarConverter;
import pingwit.lec_21.converter.CarDtoConverter;
import pingwit.lec_21.dto.CarDto;
import pingwit.lec_21.entity.Car;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/car")
public class CarController {

    private static final Map<Long, Car> CARS = new HashMap<>();

    private static  AtomicLong ATOMIC_LONG;

    private final CarConverter carConverter;
    private final CarDtoConverter carDtoConverter;

    public CarController(CarConverter carConverter, CarDtoConverter carDtoConverter) {
        this.carConverter = carConverter;
        this.carDtoConverter = carDtoConverter;
    }

    @PostConstruct
    private void init() {
    CARS.put(1L, new Car(1L, "BMW",UUID.randomUUID().toString()));
    CARS.put(2L, new Car(2L, "Renault",UUID.randomUUID().toString()));
    CARS.put(3L, new Car(3L, "Tesla",UUID.randomUUID().toString()));

        ATOMIC_LONG = new AtomicLong(CARS.size());
    }

    @GetMapping("/path/{id}")
    public CarDto carRequestParam(@PathVariable Long id, @RequestParam String name, @RequestParam List<String> colors) {
        Car car = CARS.get(id);
        System.out.println("name = " + name);
        return carDtoConverter.convert(car);
    }

    @GetMapping("/get/{id}")
    public CarDto carPathVariable(@PathVariable Long id) {
        Car car = CARS.get(id);
        return carDtoConverter.convert(car);
    }
    @GetMapping("/all")
    public List<CarDto> getAll(){
    return CARS.values().stream()
            .map(carDtoConverter::convert)
            .toList();
    }

    @PostMapping("/save")
    public Long save(@RequestBody CarDto carDto) {
        Long id = ATOMIC_LONG.incrementAndGet();
        Car car = carConverter.convert(carDto, id);

        CARS.put(id, car);
        return id;
    }
}

