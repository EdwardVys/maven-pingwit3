package pingwit.lec_24_25.classwork.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import pingwit.lec_24_25.classwork.dto.HouseDto;
import pingwit.lec_24_25.classwork.entity.HouseType;
import pingwit.lec_24_25.classwork.service.HouseService;

import java.util.List;

@RestController
@RequestMapping("/house")
public class HouseController {

    private final HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @PostMapping("/save")
    public Long save(@RequestBody HouseDto dto) throws Exception {
        return houseService.save(dto);
    }

    @GetMapping("/{id}")
    public HouseDto findAllByHouseType(@PathVariable Long id) {
        return houseService.findById(id);
    }

    @GetMapping("/type/{houseType}")
    public List<HouseDto> findAllByHouseType(@PathVariable HouseType houseType) {
        return houseService.findAllByHouseType(houseType);
    }

    @GetMapping("/search")
    public List<HouseDto> findAllByIdIn(@RequestParam HouseType houseType, @RequestParam List<Long> ids) {
        return houseService.findAllByHouseTypeAndIdIn(houseType, ids);
    }

    @GetMapping("/search/floor/{floor}")
    public List<HouseDto> findAllByFloorGreaterThanEqualOrderByIdDesc(@PathVariable Integer floor) {
        return houseService.findAllByFloorGreaterThanEqualOrderByIdDesc(floor);
    }
}
