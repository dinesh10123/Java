package customerAccount;

public class Customer {
	private String name;
	private int id;
	private String addr;
	private double pno;
	private Account account;
	public Customer(String name, int id, String addr, double pno, Account account) {
		super();
		this.name = name;
		this.id = id;
		this.addr = addr;
		this.pno = pno;
		this.account = account;
	}
	
	public void disp() {
		System.out.println("Name : "+name);
		System.out.println("Id : "+id);
		System.out.println("Address : "+addr);
		System.out.println("Phone no : "+pno);
		System.out.println("Acount detail");
		account.disp();
	}
	
	public void showInterest() {
		try {
			double interest = account.calculateInterest();
			System.out.println("Interest : "+interest);
		}catch(NegativeBalanceException e) {
			System.err.println("Error : "+e);
		}
	}
	
}
