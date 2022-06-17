package pingwit.lec_26.service;


import org.springframework.stereotype.Component;
import pingwit.lec_26.dto.MilkProducerDto;
import pingwit.lec_26.entity.Milk;
import pingwit.lec_26.entity.MilkProducer;

import java.util.List;

@Component
public class MilkProducerConverter {

    public List<MilkProducer> toLocal(Milk milk, List<MilkProducerDto> milkProducers) {
        if (milkProducers == null) {
            return null;
        }
        return milkProducers.stream()
                .map(dto -> toLocal(milk, dto))
                .toList();
    }

    public MilkProducer toLocal(Milk milk, MilkProducerDto dto) {
        MilkProducer milkProducer = new MilkProducer();

        milkProducer.setId(dto.id());
        milkProducer.setName(dto.name());
        milkProducer.setMilk(milk);

        return milkProducer;

    }

    public List<MilkProducerDto> toFront(List<MilkProducer> milkProducers) {
        return milkProducers.stream()
                .map(this::toFront)
                .toList();
    }

    public MilkProducerDto toFront(MilkProducer milkProducer) {

        return new MilkProducerDto(milkProducer.getId(), milkProducer.getName());
    }
}
