package pingwit.lec_24.classwork.dto;

import pingwit.lec_24.classwork.entity.HouseType;

public record HouseDto(Long id, HouseType houseType, Integer floor, Integer entrance) {
}
