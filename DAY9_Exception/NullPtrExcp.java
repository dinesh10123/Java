// Null Pointer Exception
// Write a program that initializes a string variable to null and then tries to call a method on it. 
// Use a try block to call the method and a catch block to handle the NullPointerException. 
// Ensure a finally block prints a message indicating the operation is complete
public class NullPtrExcp{
	public static void main(String[] args) {
		try{
			String s = null;
			System.out.println(s.length());
		}
		catch(NullPointerException e){
			e.printStackTrace();
			//System.out.println(e);
		}
		finally{
			System.out.println("operation is complete");
		}
	}
}