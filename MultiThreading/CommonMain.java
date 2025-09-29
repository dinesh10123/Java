package MultiThreading;

public class CommonMain {

	public static void main(String[] args) {
		PrimeFibo pb = new PrimeFibo();
		
		Thread t1 = new Thread() {
			public void run() {
				pb.primeno();
			}
		};
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		Thread t2 = new Thread() {
			public void run() {
				pb.fibonacci();
			}
		};
		t2.start();
		
		Thread t3 = new Thread() {
			public void run() {
				pb.commonPrimeFibo();
			}
		};
		t3.start();
		 
		Thread t4 = new Thread() {
			public void run() {
				pb.strongno();
			}
		};
		t4.start();
		
		Thread t5 = new Thread() {
			public void run() {
				pb.perfectno();
			}
		};
		t5.start();
		
		Thread t6 = new Thread() {
			public void run() {
				pb.armstrongno();
			}
		};
		t6.start();
		

	}

}
