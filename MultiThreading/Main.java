package MultiThreading;

public class Main {
	public static void main(String[] args) {
		SynchronizedDemo sd = new SynchronizedDemo();
		
		Thread t1 = new Thread() {
			public void run() {
				sd.dispUpper();
			}
		};
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				sd.dispLower();
			}
		};
		t2.start();
		
		Thread t3 = new Thread() {
			public void run() {
				sd.dispNo();
			}
		};
		t3.start();
	}
}
