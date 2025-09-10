import java.util.Scanner;
public class Calculator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition 1 : ");
		System.out.println("Subtraction 2 : ");
		System.out.println("Multiplication 3 : ");
		System.out.println("Division 4 : ");
		System.out.println("Modulo 5 : ");
		System.out.println("Exit 6 : ");
		System.out.print("Enter Case (1-6) : ");
		int n = sc.nextInt();

		switch(n){
		case 1:
			int a,b,sum;
			//Scanner sc = new Scanner(System.in);
			System.out.print("Enter First Number : ");
			a = sc.nextInt();
			System.out.print("Enter Second Number : ");
			b = sc.nextInt();
			sum = a + b;
			System.out.print("Addition is "+ sum);
			//break;

		case 2:
			int diff;
			//Scanner sc = new Scanner(System.in);
			System.out.print("Enter First Number : ");
			a = sc.nextInt();
			System.out.print("Enter Second Number : ");
			b = sc.nextInt();
			diff = a - b;
			System.out.print("Subtraction is "+ diff);
			break;

		case 3:
			int mul;
			//Scanner sc = new Scanner(System.in);
			System.out.print("Enter First Number : ");
			a = sc.nextInt();
			System.out.print("Enter Second Number : ");
			b = sc.nextInt();
			mul = a * b;
			System.out.print("Multiplication is "+ mul);
			break;

		case 4:
			int div;
			// Scanner sc = new Scanner(System.in);
			System.out.print("Enter First Number : ");
			a = sc.nextInt();
			System.out.print("Enter Second Number : ");
			b = sc.nextInt();
			div = a / b;
			System.out.print("Division is "+ div);
			break;

		case 5:
			int mod;
			//Scanner sc = new Scanner(System.in);
			System.out.print("Enter First Number : ");
			a = sc.nextInt();
			System.out.print("Enter Second Number : ");
			b = sc.nextInt();
			mod = a % b;
			System.out.print("Addition is "+ mod);
			break;

		case 6:
			System.out.print("Thank You!");
			break;

		default : 
			System.out.print("Enter Valid case : ");

		}
	}
}