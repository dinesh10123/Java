package fileDemo;

import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:/CDAC/JAVA/abc.txt", true);
		fw.write("Dinesh Mali\n");
		fw.write("CDAC Hyderabad");
		fw.close();
	}
}
