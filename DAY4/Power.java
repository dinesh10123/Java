import java.util.Scanner;
public class Power{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Base : ");
		int n = sc.nextInt();
		System.out.print("Enter Exponend : ");
		int m = sc.nextInt();

		int result = 1;
		for(int i=1; i<=m; i++){
			result *= n;
		}
		System.out.println(n+"^"+m+ " = "+result);
	}
}