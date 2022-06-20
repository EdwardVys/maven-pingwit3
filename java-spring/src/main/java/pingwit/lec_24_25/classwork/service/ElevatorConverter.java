package pingwit.lec_24_25.classwork.service;

import org.springframework.stereotype.Component;
import pingwit.lec_24_25.classwork.dto.ElevatorDto;
import pingwit.lec_24_25.classwork.entity.Elevator;
import pingwit.lec_24_25.classwork.entity.House;

import java.util.List;

@Component
public class ElevatorConverter {

    public Elevator toLocal(House house, ElevatorDto dto) {
        if (dto == null) {
            return null;
        }

        Elevator elevator = new Elevator();
        elevator.setProducer(dto.producer());
        elevator.setHouse(house);

        return elevator;
    }

    public ElevatorDto toFront(Elevator elevator) {
        if (elevator == null) {
            return null;
        }

        return new ElevatorDto(elevator.getId(), elevator.getProducer());
    }

    public List<Elevator> toLocal(House house, List<ElevatorDto> elevatorDtos) {
        if (elevatorDtos == null) {
            return null;
        }

        return elevatorDtos.stream()
                .map(dto -> toLocal(house, dto))
                .toList();
    }

    public List<ElevatorDto> toFront(List<Elevator> elevators) {
        if (elevators == null) {
            return null;
        }

        return elevators.stream()
                .map(this::toFront)
                .toList();
    }

// лишняя строка
}
