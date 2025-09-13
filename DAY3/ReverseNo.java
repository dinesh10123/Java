import java.util.Scanner;
public class ReverseNo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		int digit;
		int reverse = 0;
		int x = num;
		while(num>0){
			digit = num%10;
			reverse = reverse*10 + digit;
			num = num/10;
		}
		System.out.println("Reverse of "+ x + " is "+reverse);
	}
}