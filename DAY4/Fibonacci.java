import java.util.Scanner;
class Fibonacci{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		int a=0, b=1;
		System.out.print("Fibonacci series : ");
		for(int i=1; i<n; i++){
			System.out.print(a+" ");
			int temp = a + b;
			a = b;
			b = temp;
		}
	}
}