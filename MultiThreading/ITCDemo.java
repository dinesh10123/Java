package MultiThreading;

public class ITCDemo {

	public static void main(String[] args) {
		Customer c = new Customer(25000);
		
		new Thread() {
			public void run() {
				c.withdrow(30000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(15000);
			}
		}.start();

	}

}
