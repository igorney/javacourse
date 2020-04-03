package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program32 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.print("What is the dollar price?: ");
		double dollarPrice = scan.nextDouble();
		System.out.print("How many dollars will be bought?: ");
		double aumount = scan.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.dollarToReal(dollarPrice, aumount));
		
		scan.close();
	}

}
