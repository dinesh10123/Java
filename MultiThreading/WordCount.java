package MultiThreading;

import java.io.*;

public class WordCount {
	public synchronized void wordCount(String filename) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			int count=0;
			String line;
			while((line = br.readLine()) != null) {
				String [] words = line.split("\\W+");
				for(String word : words) {
					if(!(word.isEmpty())) {
						count++;
						try {
							Thread.sleep(5);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
			System.out.println("File "+filename+ " word count = "+count);
		}
	}
}
