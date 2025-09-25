// Array Index Out of Bounds
// Task: Write a program that initializes an array of integers and tries to access an index 
// that is out of bounds. Use a try block to access the array and a catch block to handle the 
// ArrayIndexOutOfBoundsException. Ensure a finally block prints a message indicating the 
// operation is complete

public class ArrIndexExcp{
	public static void main(String[] args) {
		try {
			int arr[] = new int[5];
			arr[5] = 10;
		}
		catch(ArrayIndexOutOfBoundsException e){

			System.err.println(e);
		}
		finally{
			System.out.println("Operation is complete");
		}
		
	}
}