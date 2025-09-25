// Problem: Nested Try Blocks with Multiple Exceptions
// Task: Write a program that demonstrates the use of nested try blocks. The program should 
// perform the following tasks:
// try should have two separate try blocks.
// In the first nested try:
// Divide two integers, handling any potential ArithmeticException.

// Within the second try block, initialize an array and attempt to access an out-of-bounds index, 
// handling the ArrayIndexOutOfBoundsException. Ensure that appropriate messages are printed 
// for each exception, and that a final message is printed indicating the completion of
// the operation.
import java.util.Scanner;
public class NestedExcp{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		System.out.println("Enter Two Number:");
		a = sc.nextInt();
		b = sc.nextInt();
		try{

			try{
				int div = a/b;
				System.out.println(div); 
			}
			catch(ArithmeticException e){
				System.err.println(e);
			}

			try{
				int arr[] = new int[5];
				arr[5] = 20;
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("operation is complete");
		}
	}
}