package pingwit.lec_26.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Milk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private Double fatPercent;
    private Double volume;

   @OneToMany(mappedBy = "milk", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<MilkProducer> milkProducers = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getFatPercent() {
        return fatPercent;
    }

    public void setFatPercent(Double fatPercent) {
        this.fatPercent = fatPercent;
    }

    public List<MilkProducer> getMilkProducers() {
        return milkProducers;
    }

    public void setMilkProducers(List<MilkProducer> milkProducers) {
        this.milkProducers = milkProducers;
    }
}
