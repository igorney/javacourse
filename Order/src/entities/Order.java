package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> itens = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Double getTotal(){
        Double total = 0.0;
        for(OrderItem item : itens){
            total += item.subTotal();
        }
        return total;
    }

    public void addItem(OrderItem item) {
        itens.add(item);
    }

    public void removeItem(OrderItem item) {
        itens.remove(item);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append(
                "ORDER SUMMARY:\n"+
                        "Order moment: " + sdf.format(getMoment()) + "\n" +
                        "Order Status: "+ getStatus() + "\n"
        );
        string.append(
                client.getName() + " " + sdf2.format(client.getBirthDate()) + " - " + client.getEmail() + "\n"
        );
        string.append(
                "Order Itens:\n"
        );
        for(OrderItem item : itens){
            string.append(item.getProduct().getName() + ", $"+ item.getProduct().getPrice()+ ", Quantity: "+ item.getQuantity()+ ", Subtotal: $"+ item.subTotal()+ "\n");
        }
        string.append("Total price: $"+ getTotal());
        return string.toString();
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
