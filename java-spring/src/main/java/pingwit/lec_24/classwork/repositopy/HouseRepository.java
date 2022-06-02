package pingwit.lec_24.classwork.repositopy;

import org.springframework.data.repository.PagingAndSortingRepository;
import pingwit.lec_24.classwork.entity.House;
import pingwit.lec_24.classwork.entity.HouseType;

import java.util.List;

public interface HouseRepository extends PagingAndSortingRepository<House, Long> {

    List<House> findAllByHouseType(HouseType houseType);

    List<House> findAllByIdIn(List<Long> ids);

    List<House> findAllByHouseTypeAndIdIn(HouseType houseType, List<Long> ids);

    List<House> findAllByFloorGreaterThanEqualOrderByIdDesc(Integer floor);
}
