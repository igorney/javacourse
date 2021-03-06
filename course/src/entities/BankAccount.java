package entities;

public class BankAccount {
	private int number;
	private String holder;
	private double balance;

	public BankAccount(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public BankAccount(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public double deposit(double value) {
		return this.balance += value;
	}

	public double withdraw(double value) {
		return this.balance -= value;
	}

	public String toString() {
		return "Account " + getNumber() + ", Holder: " + getHolder() + ", Balance: $ " + getBalance() + "\n";
	}

	public int getNumber() {
		return number;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public String getHolder() {
		return holder;
	}

	public double getBalance() {
		return balance;
	}

}
