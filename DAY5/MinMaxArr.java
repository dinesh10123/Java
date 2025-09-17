import java.util.Scanner;
class MinMaxArr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.print("Enter elements in array : ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		int max = arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]<min)
				min = arr[i];
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println("Minimum element is "+min);
		System.out.println("Maximum element is "+max);
	}
}