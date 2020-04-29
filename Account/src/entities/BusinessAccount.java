package entities;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount <= loanLimit) {
            balance += amount - 10.0; //balance protected available in same package classes
        }
        else{
            System.out.println("No Balance");
        }
    }
}
