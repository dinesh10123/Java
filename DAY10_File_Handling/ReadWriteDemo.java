package fileDemo;

import java.io.*;

public class ReadWriteDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:/CDAC/Eclipse/Java/src/fileDemo/ReadWriteDemo.java");
		
		FileWriter fw = new FileWriter("D:/CDAC/Java/Output.txt");
		int lc = 0;
		int wc = 0;
		int cc = 0;
		int i;
		while((i=fr.read())!=-1) {
			System.out.println((char)i);
			cc++;
			
			if(i == ' ')
				wc++;
			if(i == '\n')
				lc++;
		}
		fw.write("\nNo of character : "+cc);
		fw.write("\nNo of words : "+(wc+lc));
		fw.write("\nNo of lines : "+lc);
		
		fr.close();
		fw.close();
	}

}
