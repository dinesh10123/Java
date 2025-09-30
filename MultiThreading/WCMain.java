package MultiThreading;

import java.io.IOException;

public class WCMain {
	public static void main(String[] args) {
		WordCount wc = new WordCount();
		
		Thread t1 = new Thread() {
			public void run() {
				try {
					wc.wordCount("D:/CDAC/JAVA/File1.txt");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				try {
					wc.wordCount("D:/CDAC/JAVA/File2.txt");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		t2.start();
		
		Thread t3 = new Thread() {
			public void run() {
				try {
					wc.wordCount("D:/CDAC/JAVA/File3.txt");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		t3.start();
	}
}
