//Instance members
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//New variables;
		Product product = new Product();
		Scanner scan = new Scanner(System.in);
		int quantity;
		//Input product data;
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = scan.nextLine();
		System.out.print("Price: ");
		product.price = scan.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = scan.nextInt();
		//Print and Processing data;
		System.out.println("Product data: " + product.toString());
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = scan.nextInt();
		product.addProducts(quantity);
		System.out.println("Updated data: " + product.toString());
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = scan.nextInt();
		product.removeProducts(quantity);
		System.out.println("Updated data: " + product.toString());
		
		scan.close();
	}

}
