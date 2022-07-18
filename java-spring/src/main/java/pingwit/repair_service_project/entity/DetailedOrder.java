package pingwit.repair_service_project.entity;


import javax.persistence.*;

@Entity
public class DetailedOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String diagnostics;
    private String spareParts;
    private Integer estimatedCost;
    private Integer estimatedDate;
    @OneToOne
    @JoinColumn (name = "order_id")
    private Order order;

    @OneToOne(mappedBy = "detailedOrder")
    private DetailedSparePartsCost detailedSparePartsCost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiagnostics() {
        return diagnostics;
    }

    public void setDiagnostics(String diagnostics) {
        this.diagnostics = diagnostics;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public Integer getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(Integer estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public Integer getEstimatedDate() {
        return estimatedDate;
    }

    public void setEstimatedDate(Integer estimatedDate) {
        this.estimatedDate = estimatedDate;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public DetailedSparePartsCost getDetailedSparePartsCost() {
        return detailedSparePartsCost;
    }

    public void setDetailedSparePartsCost(DetailedSparePartsCost detailedSparePartsCost) {
        this.detailedSparePartsCost = detailedSparePartsCost;
    }
}

