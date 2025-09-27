package customerAccount;

public class Account {
	private String accType;
	private int accno;
	private double minbalance;
	private double balance;
	public Account(String accType, int accno, double minbalance, double balance) {
		super();
		this.accType = accType;
		this.accno = accno;
		this.minbalance = minbalance;
		this.balance = balance;
	}
	public double calculateInterest() throws NegativeBalanceException {
		if(balance<0) {
			throw new NegativeBalanceException("Balance is in Negative");
		}
	double rate = 0.5;
	int time = 2;
	return (balance * rate * time)/100;
}
		
	public void disp() {
		System.out.println("Account Type : "+accType);
		System.out.println("Account Number : "+accno);
		System.out.println("Minimum Balance : "+minbalance);
		System.out.println("Balance : "+balance);
	}
	
}
