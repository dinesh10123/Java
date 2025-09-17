import java.util.Scanner;
class ArrAddition{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Row : ");
		int m = sc.nextInt();
		System.out.print("Enter column : ");
		int n = sc.nextInt();

		int a[][] = new int[m][n];
		int b[][] = new int[m][n];
		int sum[][] = new int[m][n];
		System.out.print("Enter element in first matrix : ");
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				a[i][j] = sc.nextInt();
			}
		} 
		System.out.print("Enter element in Second matrix : ");
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				b[i][j] = sc.nextInt();
			}
		} 

		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				sum[i][j] = a[i][j] + b[i][j];
			}
		} 

		System.out.println("Addition : ");
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.print(sum[i][j]+ " ");
			}
			System.out.println();
		}

	}
}