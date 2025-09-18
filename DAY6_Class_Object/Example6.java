// Static Method: Add a static method to the BankAccount class from the previous problem 
// to calculate interest based on a given balance and interest rate.
//  Also, implement a method to display the account details including balance and interest earned.

class BankAccount{
	int accno;
	double balance;
	static double rate = 0.5;

	// static{
	// 	rate = 0.5;
	// }

	BankAccount(int accno, double balance){
		this.accno = accno;
		this.balance = balance;
	}
	public static double interestRate(double balance){
		return (balance * rate)/100;
	}

	public void display(){
		double interest = interestRate(balance);
		System.out.println("Account no : "+accno+", Balance : "+balance+", Rate : "+interest);
	}
}
public class Example6{
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(101,10000);
		BankAccount b2 = new BankAccount(102,20000);

		b1.display();
		b2.display();
	}
}
