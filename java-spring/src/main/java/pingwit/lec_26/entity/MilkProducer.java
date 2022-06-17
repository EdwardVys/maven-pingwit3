package pingwit.lec_26.entity;

import javax.persistence.*;

@Entity
public class MilkProducer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "milk_id")
    private Milk milk;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Milk getMilk() {
        return milk;
    }

    public void setMilk(Milk milk) {
        this.milk = milk;
    }
}
