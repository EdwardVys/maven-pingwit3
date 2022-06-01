package pingwit.lec_24.classwork.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pingwit.lec_24.classwork.dto.HouseDto;
import pingwit.lec_24.classwork.service.HouseService;

@RestController
@RequestMapping("/house")
public class HouseController {
    private final HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @PostMapping("/save")
    public Long save(HouseDto dto) {
        return houseService.save(dto);
    }

}
