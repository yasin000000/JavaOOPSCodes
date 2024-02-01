package abstractionExamples;

abstract class Account {
	protected String accountNumber;
	protected double balance;

	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited $" + amount + " into account " + accountNumber);
	}

	public abstract void withdraw(double amount);
}

class Current extends Account {
	public Current(String accountNumber, double balance) {
		super(accountNumber, balance);
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

class SavingsAccount extends Account {

	public SavingsAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
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

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited ");
	}
}

public class BankingSystem {

	public static void main(String[] args) {
		Account checkingAccount = new Current("C123", 1000);
		Account savingsAccount = new SavingsAccount("S456", 5000, 3);

		savingsAccount.deposit(500);
		savingsAccount.withdraw(200);
		
		checkingAccount.deposit(100);
		checkingAccount.withdraw(34);

	}

}
