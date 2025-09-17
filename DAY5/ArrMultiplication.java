import java.util.Scanner;
class ArrMultiplication{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Row of first matrix : ");
		int m1 = sc.nextInt();
		System.out.print("Enter column of first matrix : ");
		int n1 = sc.nextInt();
		System.out.print("Enter Row of second matrix : ");
		int m2 = sc.nextInt();
		System.out.print("Enter column of second matrix : ");
		int n2 = sc.nextInt();
		int a[][] = new int[m1][n1];
		int b[][] = new int[m2][n2];
		int product[][] = new int[m1][n2];

		if(n1 != m2){
			System.out.println("Matrix multiplication is not possible");
			return ;
		}

		System.out.print("Enter element in first matrix : ");
		for(int i=0; i<m1; i++){
			for(int j=0; j<n1; j++){
				a[i][j] = sc.nextInt();
			}
		} 
		System.out.print("Enter element in Second matrix : ");
		for(int i=0; i<m2; i++){
			for(int j=0; j<n2; j++){
				b[i][j] = sc.nextInt();
			}
		} 

		for(int i=0; i<m1; i++){
			for(int j=0; j<n2; j++){
				product[i][j] = 0;
			}
		} 

		for(int i=0; i<m1; i++){
			for(int j=0; j<n2; j++){
				for(int k=0; k<n1; k++){
					product[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("Multiplication : ");
		for(int i=0; i<m1; i++){
			for(int j=0; j<n2; j++){
				System.out.print(product[i][j]+ " "); 
			}
			System.out.println();
		} 
		
	}
}