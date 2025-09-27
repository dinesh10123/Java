package fileDemo;

import java.io.*;
import java.util.*;

public class UniqueWord {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("D:/CDAC/JAVA/abc.txt"));
        String line;
        Set<String> uniqueWords = new HashSet<>();

        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\W+"); 
            for (String word : words) {
                if (!word.isEmpty()) {
                    uniqueWords.add(word.toLowerCase());
                }
            }
        }
        br.close();

        System.out.println("Uniqque words in file:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
	}
}
