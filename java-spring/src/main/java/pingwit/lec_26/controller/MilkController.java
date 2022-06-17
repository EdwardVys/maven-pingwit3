package pingwit.lec_26.controller;

import org.springframework.web.bind.annotation.*;
import pingwit.lec_26.dto.MilkDto;
import pingwit.lec_26.service.MilkService;

import javax.security.auth.login.AccountException;
import java.nio.file.AccessDeniedException;

@RestController
@RequestMapping("/milk")
public class MilkController {

    private final MilkService milkService;

    public MilkController(MilkService milkService) {
        this.milkService = milkService;
    }

    @PostMapping("/save")
    public Long save(@RequestBody MilkDto dto) {
        return milkService.save(dto);
    }

    @PutMapping("/update")
    public Long update(@RequestBody MilkDto dto) {
        return milkService.update(dto);
    }

    @GetMapping("/id/{id}")
    public MilkDto getById(@PathVariable Long id) {
        return milkService.getById(id);
    }

    @GetMapping("/id/broken/{id}")
    public MilkDto getByIdBroken(@PathVariable Long id) throws AccountException, AccessDeniedException {
        return milkService.getByIdBroken(id);
    }
}