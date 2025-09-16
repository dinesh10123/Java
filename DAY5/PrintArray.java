import java.util.Scanner;
public class PrintArray{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		System.out.print("Enter element in array :  ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++){
			System.out.println("arr["+i+"]"+ " = "+arr[i]);
		}
	}
}