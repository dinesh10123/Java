package MultiThreading;

class Welcome implements Runnable{
	public void run() {
		for(int i=0; i<10; i++) {
		System.out.println("Welcome");
		System.out.println("Good Morning");
	}
	}
	
	public static void main(String[] args) {
		Welcome w = new Welcome();
		Thread t1 = new Thread(w);
		t1.start();
		Thread t2 = new Thread(w);
		t2.start();
	}
}
