import java.util.Scanner;
public class SumofDigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int digit;
		d = num%10;
		sum += d;
		num = num/10;
		System.out.println("Sum of Digit of "+num+" is "sum);
	}
}