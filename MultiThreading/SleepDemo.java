package MultiThreading;

class SleepDemo extends Thread {
	public void run() {
		for(int i=0; i<15; i=i+2) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		SleepDemo t1 = new SleepDemo();
		t1.start();
		
		SleepDemo t2 = new SleepDemo();
		t2.start();
	}
}
