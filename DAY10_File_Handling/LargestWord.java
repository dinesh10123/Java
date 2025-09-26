package fileDemo;

import java.io.*;

public class LargestWord {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("D:/CDAC/JAVA/abc.txt"));
		String longestWord = "";
		String s;
		while((s = br.readLine()) != null) {
			String [] words = s.split("\\W");
			
			for(String word : words) 
			{
				if(word.length() > longestWord.length() ) 
				{
					longestWord = word;
				}
			}
		}
		if(!longestWord.isEmpty())
		{
			System.out.println("Longest Word : "+longestWord);
			System.out.println("Length : "+longestWord.length());
		}
		else {
			System.out.println("No words found in file");
		}
	}
}
