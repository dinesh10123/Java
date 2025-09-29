package MultiThreading;

class GetSetDemo extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		//System.out.println(Thread.currentThread().getId());
	}
	public static void main(String[] args) {
		GetSetDemo d1 = new GetSetDemo();
		d1.setName("Dinesh");
		GetSetDemo d2 = new GetSetDemo();
		d2.setPriority(MAX_PRIORITY);
		GetSetDemo d3 = new GetSetDemo();
		d3.setName("Mali");
		
		d1.start();
		d2.start();
		d3.start();
	}
}
