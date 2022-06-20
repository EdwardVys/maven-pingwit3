package pingwit.lec_29.classwork.dto;

import pingwit.lec_29.classwork.model.Coffee;

public record CoffeeDto(Coffee coffee, Integer volume, Boolean sugar) {

}