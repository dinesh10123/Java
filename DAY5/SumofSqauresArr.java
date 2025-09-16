import java.util.Scanner;
class SumofSqauresArr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.print("Enter elements in array : ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<arr.length; i+=2){
			sum += arr[i+1]*arr[i+1];
		}
		System.out.println("Sum of squares of odd index is "+sum);
	}
}