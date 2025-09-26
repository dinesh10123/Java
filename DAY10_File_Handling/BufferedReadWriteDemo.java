package fileDemo;

import java.io.*;

public class BufferedReadWriteDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:/CDAC/Eclipse/Java/src/fileDemo/BufferedReadWriteDemo.java");
		BufferedReader br = new BufferedReader(fr);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:/CDAC/Java/BufferedRWDemo.java"));
		
		String line = br.readLine();
		while(line != null) {
			bw.write(line);
			line = br.readLine();
		}
		System.out.println("success");
		br.close();
		bw.close();
	}
}
