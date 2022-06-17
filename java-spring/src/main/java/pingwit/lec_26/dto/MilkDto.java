package pingwit.lec_26.dto;

import java.util.List;

public record MilkDto(
        Long id,
        Double fatPercent,
        Double volume,
        List<MilkProducerDto> milkProducers
) {
}
