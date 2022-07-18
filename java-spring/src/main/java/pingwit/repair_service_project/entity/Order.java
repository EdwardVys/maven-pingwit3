package pingwit.repair_service_project.entity;

import javax.persistence.*;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String device;
    private String claimedDefect;
    private String orderDate;
    private String issueDate;

    @OneToOne(mappedBy = "order")
    private DetailedOrder detailedOrder;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Long getId() {
    return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getClaimedDefect() {
        return claimedDefect;
    }

    public void setClaimedDefect(String claimedDefect) {
        this.claimedDefect = claimedDefect;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public DetailedOrder getDetailedOrder() {
        return detailedOrder;
    }

    public void setDetailedOrder(DetailedOrder detailedOrder) {
        this.detailedOrder = detailedOrder;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


}
