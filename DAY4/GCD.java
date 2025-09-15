import java.util.Scanner;
class GCD{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b = sc.nextInt();

		int gcd=1;
		for(int i=1; i<=a && i<= b; i++){
			if(a%i == 0 && b%i == 0){
				gcd = i;
			}
		}
		System.out.println("GCD of "+a+" and "+b+" is "+gcd);
		// while(b != 0){
		// 	int temp = b;
		// 	b = a%b;
		// 	a = temp;
		// }
		// System.out.println("GCD is "+a);
	}
}