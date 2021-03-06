package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Bank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter account number: ");
		int number = scan.nextInt();
		System.out.print("Enter account holder: ");
		String name = scan.next();
		System.out.print("Is there na initial deposit (y/n)? ");
		char option = scan.next().charAt(0);
		BankAccount account;
		if (option == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = scan.nextDouble();
			account = new BankAccount(number, name, initialDeposit);
		}
		else {
			account = new BankAccount(number, name);
		}
		printAccount(account);

		System.out.print("Enter a deposit value: ");
		double value = scan.nextDouble();
		account.deposit(value);
		
		printAccount(account);
		
		System.out.print("Enter a withdraw value: ");
		value = scan.nextDouble();
		account.withdraw(value);
		
		printAccount(account);
		
		scan.close();

	}
	static void printAccount(BankAccount account) {
		System.out.println("Account data: ");
		System.out.print(account.toString());
	}

}
