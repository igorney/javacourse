package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class ProgramEnum {
    public static void main(String[] args){
        Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order.toString());
        OrderStatus os;
        os = OrderStatus.valueOf("PROCESSING");
        order.setStatus(os);
        System.out.println(order.toString());
        os = OrderStatus.DELIVERED;
        order.setStatus(os);
        System.out.println(order.toString());
    }
}
