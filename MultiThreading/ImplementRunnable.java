package MultiThreading;
class ImplementRunnable implements Runnable {
	public void run() {
		for(int i=0; i<15; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ImplementRunnable r = new ImplementRunnable();
		Thread t1 = new Thread(r);
		t1.start();
		
		Thread t2 = new Thread(r);
		t2.start();
		
	}
}
