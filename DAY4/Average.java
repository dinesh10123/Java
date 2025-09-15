import java.util.Scanner;
class Average{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of list : ");
		int n = sc.nextInt();
		System.out.print("Enter numbers : ");
		int sum = 0;
		for(int i=0; i<n; i++){
			int num = sc.nextInt();
			sum += num;
		}
		double avg = (double)sum/n;
		System.out.println("Average : "+avg);

	}
}