package pingwit.repair_service_project.entity;


import com.sun.xml.bind.v2.TODO;

import javax.persistence.*;

@Entity
public class DetailedSparePartsCost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detailedOrderId;
    private Long id;
    private Integer originalPrice;
    private Integer replicaPrice;
    private String deliveryTime;
    private Integer difficultyCategory;
    private Integer totalCost;
    @OneToOne
    @JoinColumn(name = "detailed_order_id")
    private DetailedOrder detailedOrder;

    public Long getDetailedOrderId() {
        return detailedOrderId;
    }

    public void setDetailedOrderId(Long detailedOrderId) {
        this.detailedOrderId = detailedOrderId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Integer getReplicaPrice() {
        return replicaPrice;
    }

    public void setReplicaPrice(Integer replicaPrice) {
        this.replicaPrice = replicaPrice;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Integer getDifficultyCategory() {
        return difficultyCategory;
    }

    public void setDifficultyCategory(Integer difficultyCategory) {
        this.difficultyCategory = difficultyCategory;
    }

    public Integer getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }

    public DetailedOrder getDetailedOrder() {
        return detailedOrder;
    }

    public void setDetailedOrder(DetailedOrder detailedOrder) {
        this.detailedOrder = detailedOrder;
    }
}
