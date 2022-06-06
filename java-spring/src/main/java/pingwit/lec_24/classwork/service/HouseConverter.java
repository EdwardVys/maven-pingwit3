package pingwit.lec_24.classwork.service;


import org.springframework.stereotype.Component;
import pingwit.lec_24.classwork.dto.AddressDto;
import pingwit.lec_24.classwork.dto.HouseDto;
import pingwit.lec_24.classwork.entity.Address;
import pingwit.lec_24.classwork.entity.House;

@Component
public class HouseConverter {

    private final AddressConverter addressConverter;

    public HouseConverter(AddressConverter addressConverter) {
        this.addressConverter = addressConverter;
    }

    public HouseDto toFront(House house) {
        AddressDto addressDto = addressConverter.toFront(house.getAddress());
        return new HouseDto(house.getId(), house.getHouseType(), house.getFloor(), house.getEntrance(),addressDto);
    }

    public House toLocal(HouseDto dto) {
        Address address = addressConverter.toLocal(dto.address());
        House house = new House();

        house.setId(dto.id());
        house.setHouseType(dto.houseType());
        house.setFloor(dto.floor());
        house.setEntrance(dto.entrance());
        house.setAddress(address);

        return house;
    }
}
