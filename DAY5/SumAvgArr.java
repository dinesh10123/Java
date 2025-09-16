import java.util.Scanner;
class SumAvgArr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of array : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		System.out.print("Enter elements in array : ");

		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		double avg = sum/arr.length;
		System.out.println("Sum of array is "+sum);
		System.out.println("Average of array : "+avg);
	}
}