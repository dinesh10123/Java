import java.util.Scanner;
class SearchArr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of array : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.print("Enter elements in array : ");
		boolean flag = false;
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter element to search : ");
		int search = sc.nextInt();
		for(int i=0; i<arr.length; i++){
			if(arr[i] == search){
				System.out.println("Element "+search+" found at index "+i);
				flag = true;
				break;
			}
		}
		if(flag == false){
			System.out.println(search+" is not found");
		}
	}
}