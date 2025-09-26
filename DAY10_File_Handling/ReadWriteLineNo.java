package fileDemo;

import java.io.*;

public class ReadWriteLineNo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:/CDAC/Eclipse/Java/src/fileDemo/ReadWriteLineNo.java");
		try (BufferedReader br = new BufferedReader(fr)) {
			try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("D:/CDAC/Java/line.txt")))) {
				String line ;
				int lineno = 1;
				while((line = br.readLine()) != null) {
					pw.println(lineno+" "+line);
					lineno++;
				}
			}
		}
	}
}
