package application;

import entities.BusinessAccount;

public class Program {
    public static void main(String[] args) {
        BusinessAccount account = new BusinessAccount();
        account.loan(100.00);
    }
}
