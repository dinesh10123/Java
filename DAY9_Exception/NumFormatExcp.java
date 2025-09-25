// Number Format Exception
// Task: Write a program that takes a string input from the user and tries to convert it to an 
// integer. Use a try block to perform the conversion and a catch block to handle the 
// NumberFormatException. Ensure a finally block prints a message indicating the operation 
// is complete.
import java.util.Scanner;
public class NumFormatExcp{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter String");
			String s = sc.nextLine();
			int n = Integer.parseInt(s);
		}
		catch(NumberFormatException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("operation is complete");
		}
		
	}
}