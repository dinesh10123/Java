import java.util.Scanner;
public class TraficLight{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter R for stop, Y for wait, G for go : ");
		char ch = sc.next().charAt(0);

		switch(ch){
			case 'R':
				System.out.println("Stop");
				break;
			case 'Y':
				System.out.println("Wait");
				break;
			case 'G':
				System.out.println("Go");
				break;
			default :
				System.out.println("Enter valid Character");

		}
	}
}