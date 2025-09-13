import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		int palindrome=0;
		int x= num;
		while(num>0){
			int digit = num%10;
			palindrome = palindrome*10 + digit;
			num = num/10;
		}
		if(x == palindrome)
			System.out.println(x+ " is palindrome ");
		else
			System.out.println(x+ " is not palindrome");
	}
}