package pingwit.lec_26.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pingwit.lec_26.dto.MilkDto;
import pingwit.lec_26.entity.Milk;
import pingwit.lec_26.repository.MilkRepository;

import java.nio.file.AccessDeniedException;


@Service
public class MilkService {

    private final MilkRepository milkRepository;
    private final MilkConverter milkConverter;
    private final PingwitServiceHelper pingwitServiceHelper;

    public MilkService(MilkRepository milkRepository, MilkConverter milkConverter, PingwitServiceHelper pingwitServiceHelper) {
        this.milkRepository = milkRepository;
        this.milkConverter = milkConverter;
        this.pingwitServiceHelper = pingwitServiceHelper;
    }

    public Long save(MilkDto dto) {
        Milk milk = milkConverter.toLocal(dto);

        return milkRepository.save(milk).getId();
    }

    @Transactional
    public Long update(MilkDto dto) {
        Milk milk = milkConverter.toLocal(dto);

        Milk entity = milkRepository.findById(dto.id()).orElse(null);

        String[] nullPropertyNames = pingwitServiceHelper.getNullPropertyNames(milk);
        BeanUtils.copyProperties(milk, entity, nullPropertyNames);

        milkRepository.save(entity);

        return entity.getId();
    }

    public MilkDto getById(Long id) {
        return milkRepository.findById(id)
                .map(milkConverter::toFront)
                .orElse(null);
    }

    public MilkDto getByIdBroken(Long id) throws AccessDeniedException {
        generateException();
        return milkRepository.findById(id)
                .map(milkConverter::toFront)
                .orElse(null);
    }

    private void generateException() throws AccessDeniedException {
        throw new AccessDeniedException("filePath");
    }

}
