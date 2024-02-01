package abstractionExamples;

interface Account2 {
    String getAccountNumber();
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
}

class CheckingAccount implements Account2 {
    private String accountNumber;
    private double balance;

    public CheckingAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into account " + accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient funds in account " + accountNumber);
        }
    }
}

public class BankingSystemWithInterface {
	public static void main(String[] args) {
        Account2 checkingAccount = new CheckingAccount("C123", 1000);
     
        checkingAccount.deposit(500);       
        System.out.println("Final balance in Checking Account: $" + checkingAccount.getBalance());
        
        checkingAccount.withdraw(100);
        System.out.println("Final balance in Checking Account: $" + checkingAccount.getBalance());
        
    }
}
