package MultiThreading;

class ExtendThreadClass extends Thread{
	@Override
	public void run() {
		for(int i=0; i<15; i=i+2) {
		System.out.println(i);
		}
	}

public static void main(String [] args) {
	ExtendThreadClass t = new ExtendThreadClass();
	t.start();
	
	ExtendThreadClass t2 = new ExtendThreadClass();
	t2.start();
	}
}
