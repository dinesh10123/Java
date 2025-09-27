package fileDemo;

import java.io.*;
import java.util.*;

public class DuplicateWOrd {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("D:/CDAC/JAVA/abc.txt")); //BufferedReader reads the file line by line.
	
		String line;
		Map<String, Integer> wordCount = new HashMap<>(); //HashSet stores only unique words (no duplicates).
		while((line = br.readLine()) != null) {
			String [] words = line.split("\\W+"); //line.split("\\W+") → splits the line into words by removing punctuation, spaces, etc.
			
			for(String word : words) 
			{
				if(!word.isEmpty() ) 
				{
					word = word.toLowerCase();
					wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
				}
			}
		}
		br.close();
		System.out.println("Duplicate Words");
		 for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
             if (entry.getValue() > 1) {
                 System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
             }
         }
		}
	}

