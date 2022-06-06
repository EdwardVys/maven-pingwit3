package pingwit.lec_24.classwork.service;

import org.springframework.stereotype.Component;
import pingwit.lec_24.classwork.dto.AddressDto;
import pingwit.lec_24.classwork.entity.Address;

@Component
public class AddressConverter {
    public AddressDto toFront(Address address) {
        if (address == null) {
            return null;
        }

        return new AddressDto(address.getId(), address.getCity(), address.getStreet(), address.getNumber());
    }

    public Address toLocal(AddressDto dto) {
        if (dto == null) {
            return null;
        }

        Address address = new Address();
        address.setId(dto.id());
        address.setCity(dto.city());
        address.setStreet(dto.street());
        address.setNumber(dto.number());

        return address;
    }
}
