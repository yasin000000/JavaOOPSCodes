package encapsulationExamples;

public class ExampleFirst {
	public static void main(String args[]) {
		
		//using setter and getter methods
		BankDetails bt=new BankDetails();
		bt.setAccountno(4);
		int a =bt.getAccountno();
		System.out.println(a); 
		
		//using constructors 
		 BankAccount account = new BankAccount("123456", "John Doe", 1000);
	        account.balance += 500;
	        System.out.println("New Balance (after direct modification):" + account.balance);
	        
	    //using method
	        Bank b=new Bank();
	        b.deposit(400);
	    }
	}


//using setter and getter methods
class BankDetails {
	private int accountno;
	private String name="";
	
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

//using constructors 

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    double balance; 
    // Constructor for initializing attributes
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }
}

//Using method

class Bank {
    private double balance;

    // Methods for indirect access and modification
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}
