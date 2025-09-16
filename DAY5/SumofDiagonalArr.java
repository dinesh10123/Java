import java.util.Scanner;
class SumofDiagonalArr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Rows : ");
		int m = sc.nextInt();
		System.out.print("Enter number of Column : ");
		int n = sc.nextInt();

		int [][] arr = new int[m][n];
		if(m !=n){
			System.out.println("Diagonal Addition is not possible");
			return;
		}
		System.out.print("Enter elements in array : ");
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		int sum = 0;
		for(int i=0; i<m; i++){
			sum += arr[i][i];
		}
		System.out.println("Sum of Diagonal elements is "+sum);

	}
}