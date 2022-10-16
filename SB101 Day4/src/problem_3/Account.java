package problem_3;


public class Account {

    private String AccountNumber;
    private double Balance;

    public Account() {
        // TODO Auto-generated constructor stub
    }

    public Account(String accountNumber, double balance) {
        super();
        AccountNumber = accountNumber;
        Balance = balance;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    void deposit(double amount) {
        this.Balance=this.Balance+amount;
    }
    void withdraw(double amount) throws InsufficientFundsException{
        if(this.Balance>=amount) {
            Balance=Balance-amount;
        }else {
            InsufficientFundsException insf=new InsufficientFundsException("not enough balance");
            throw insf;
        }
    }

}

