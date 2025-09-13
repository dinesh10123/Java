import java.util.Scanner;
public class ReverseString{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		String reverse="";
		String st = str;
		for(int i=str.length()-1; i>=0; i--){
			reverse += str.charAt(i);
		}
		if(st.equals(reverse))
			System.out.println(reverse+" string is palindrome");
		else
			System.out.println(reverse+" string is not palindrome");
	}
}