import java.util.Scanner;
class SumofTwoHalfArr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int m = sc.nextInt();
		int []arr = new int[m];
		System.out.print("Enter elements in array : ");
		for(int i=0; i<m; i++){
			arr[i] = sc.nextInt();
		}
		int firstHalf = 0;
		int secondHalf = 0;
		for(int i=0; i<m/2; i++){
			firstHalf += arr[i];
		}
		for(int i=m/2; i<m; i++){
			secondHalf += arr[i];
		}
		System.out.println();
		System.out.println("Sum of First Half : "+firstHalf);
		System.out.println("Sum of Second Half : "+secondHalf);
	}
}