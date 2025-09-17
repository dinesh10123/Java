import java.util.Scanner;
class LargestSmallestArr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.print("Enter elements in array : ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-i-1; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.print("Ascending order : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("Smallest element is "+arr[0]);
		System.out.println("Largest element is "+arr[arr.length-1]);
		
	}
}