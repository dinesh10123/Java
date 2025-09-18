// Static Variable: Create a class BankAccount with accno, 
// accType, Balance and static variable interestRate. 
// Initialize it using a static block. Implement methods to deposit and withdraw funds. 
// Create objects and display details.
class BankAccount{
	int accno;
	String accType;
	double balance;
	static double rate;

	static{
		rate = 0.5;
	}

	BankAccount(int accno, String accType, double balance){
		this.accno = accno;
		this.accType = accType;
		this.balance = balance;
	}

	public void deposit(double amount){
		 balance += amount;
	}

	public void withdrow(double amount){
		if(amount <= balance)
			balance -= amount;
		else
			System.out.println("Insuffisient funds ");
	}

	public void display(){
		System.out.println("Account no : "+accno+",Account type : "+accType+", Balance : "+balance);
	}
}
public class Example5{
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(101,"current",10000);
		BankAccount b2 = new BankAccount(102,"saving",20000);

		b1.deposit(5000);
		b2.withdrow(5000);

		b1.display();
		b2.display();
	}
}
