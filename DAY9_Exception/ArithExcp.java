// Division by Zero
// Task: Write a program that takes two integers from the user and performs division. 
// Use a try block to perform the division, and a catch block to handle the ArithmeticException 
// in case of division by zero. Ensure that a finally block prints a message indicating that the 
// operation is complete.
import java.util.Scanner;
public class ArithExcp{
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number:");
		a = sc.nextInt();
		b = sc.nextInt();

		try{
			int div = a/b;
			System.out.println(div);
		}
		catch(ArithmeticException e){
			System.err.println(e);
		}
		finally{
			System.out.println("Operation is complete");
		}

	}
}

