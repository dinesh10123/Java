package customerAccount;

public class Main {
	public static void main(String []args) {
		Account acc = new Account("saving",122562,500,-777);
		
		Customer c = new Customer("Dinesh", 101, "MJ",860013,acc);
		c.disp();
		c.showInterest();
	}
}

