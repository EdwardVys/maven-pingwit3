package pingwit.lec_24.classwork.service;


import org.springframework.stereotype.Service;
import pingwit.lec_24.classwork.dto.HouseDto;
import pingwit.lec_24.classwork.entity.House;
import pingwit.lec_24.classwork.repositopy.HouseRepository;

@Service
public class HouseService {

    private final HouseRepository houseRepository;
    private final HouseConverter houseConverter;

    public HouseService(HouseRepository houseRepository, HouseConverter houseConverter) {
        this.houseRepository = houseRepository;
        this.houseConverter = houseConverter;
    }
public Long save(HouseDto dto){
    House house = houseConverter.toLocal(dto);

    return houseRepository.save(house).getId();
}

}


