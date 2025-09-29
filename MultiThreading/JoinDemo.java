package MultiThreading;
import java.lang.Thread;
class JoinDemo extends Thread {
	public void run() {
		for(int i=1; i<10; i+=2) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		JoinDemo d1 = new JoinDemo();
		JoinDemo d2 = new JoinDemo();
		JoinDemo d3 = new JoinDemo();
		d2.start();
		try {
			d2.join();;
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		d1.start();
		d3.start();
		
		
	}
}
