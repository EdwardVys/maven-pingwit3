package pingwit.lec_24_25.classwork.dto;

import pingwit.lec_24_25.classwork.entity.HouseType;

import java.util.List;

public record HouseDto(
        Long id,
        HouseType houseType,
        Integer floor,
        Integer entrance,
        AddressDto address,
        List<ElevatorDto> elevators,
        List<ResidentDto> residents
) {
}
