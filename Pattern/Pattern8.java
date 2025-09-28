import java.util.Scanner;
public class Pattern7{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number : ");
	int n = sc.nextInt();
		int k=1;
		for(int i=1; i<=5; i++){
			for(int j=0; j<n-i-1; j++)
			   System.out.print(" ");
		
			for(int j=1; j<=i; j++)
				System.out.println(k++ +" ");
		
		for(int j=0; j<n-i-1; j++)
			System.out.print(" ");
		}
		System.out.println();

	}
}