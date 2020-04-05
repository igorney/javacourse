package application;

public class ProgramEnum {
    public static void main(String[] args){
        Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order.toString());
    }
}
