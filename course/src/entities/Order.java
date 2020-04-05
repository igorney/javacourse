package entities;

import java.util.Date;

public class Order {
    private Integer id;
    private Date instant;
    private OrderStatus status;

    public Order() {
    }
    public Order(Integer id, Date instant, OrderStatus status) {
        this.id = id;
        this.instant = instant;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getInstant() {
        return instant;
    }

    public void setInstant(Date instant) {
        this.instant = instant;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Order{" +
                "id=" + id +
                ", instant=" + instant +
                ", status=" + status +
                '}';
    }
}
