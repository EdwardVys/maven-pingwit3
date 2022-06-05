package pingwit.lec_24.classwork.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pingwit.lec_24.classwork.dto.HouseDto;
import pingwit.lec_24.classwork.entity.House;
import pingwit.lec_24.classwork.entity.HouseType;
import pingwit.lec_24.classwork.repositopy.HouseRepository;

import java.util.List;

@Service
public class HouseService {

    private final HouseRepository houseRepository;
    private final HouseConverter houseConverter;

    public HouseService(HouseRepository houseRepository, HouseConverter houseConverter) {
        this.houseRepository = houseRepository;
        this.houseConverter = houseConverter;
    }

    @Transactional(rollbackFor = Exception.class)
    public Long save(HouseDto dto) throws Exception {
        House house = houseConverter.toLocal(dto);
        House savedHouse = houseRepository.save(house);

        throwExeption();

        return savedHouse.getId();
    }

    public List<HouseDto> findAllByHouseType(HouseType houseType) {
        List<House> allByHouseType = houseRepository.findAllByHouseType(houseType);


        return allByHouseType.stream()
                .map(houseConverter::toFront)
                .toList();
    }

    public List<HouseDto> findAllByIdIn(List<Long> ids) {
        List<House> findAllByIdIn = houseRepository.findAllByIdIn(ids);


        return findAllByIdIn.stream()
                .map(houseConverter::toFront)
                .toList();
    }

    public List<HouseDto> findAllByHouseTypeAndIdIn(HouseType houseType, List<Long> ids) {
        List<House> AllByHouseTypeAndIdIn = houseRepository.findAllByHouseTypeAndIdIn(houseType, ids);

        return AllByHouseTypeAndIdIn.stream()
                .map(houseConverter::toFront)
                .toList();
    }

    public List<HouseDto> findAllByFloorGreaterThanEqualOrderByIdDesc(Integer floor) {
        List<House> AllByHouseTypeAndIdIn = houseRepository.findAllByFloorGreaterThanOrderByIdDesc(floor);

        return AllByHouseTypeAndIdIn.stream()
                .map(houseConverter::toFront)
                .toList();
    }

    private void throwExeption() throws Exception {
        throw new Exception();
    }
}


