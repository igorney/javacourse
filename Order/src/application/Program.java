package application;

import com.sun.jdi.event.StepEvent;
import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = scan.next();
        System.out.print("Email: ");
        String email = scan.next();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        String birthDate = scan.next();
        System.out.println("Enter order data:");
        System.out.println("Enter order status: ");
        String orderStatus = scan.next();
        Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), new Client(name, email, sdf.parse(birthDate)));
        System.out.print("How many items to this order? ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("Enter #"+i+" item data:");
            System.out.print("Product name: ");
            String prodName = scan.next();
            System.out.print("Product price: ");
            Double prodPrice = scan.nextDouble();
            System.out.print("Product quantity: ");
            Integer prodQuantity = scan.nextInt();
            Product product = new Product(prodName, prodPrice);
            OrderItem item = new OrderItem(prodQuantity, product.getPrice(), product);
            order.addItem(item);
        }
        System.out.print(order.toString());
        scan.close();
    }
}
