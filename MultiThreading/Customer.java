package MultiThreading;

public class Customer {
	private double balance;

	public Customer(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	
	public synchronized void withdrow(double amt) {
		System.out.println("Going to withdrow");
		System.out.println("Balance : "+balance);
		if(amt>balance) {
			System.out.println("Wait for diposit");
			try {
				wait();
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
			balance  = balance - amt;
			System.out.println("Withdrow success...updated balance : "+balance);
		}
		
	public synchronized void deposit(double amt) {
		System.out.println("Going to deposit");
		balance = balance + amt;
		System.out.println("Deposit success");
		System.out.println("Updated balance : "+balance);
		notify();
		
	}
	
}
