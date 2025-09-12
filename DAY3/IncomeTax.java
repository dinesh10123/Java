import java.util.Scanner;
public class IncomeTax{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Income : ");
		int income = sc.nextInt();
		int tax = 0;

		if(income<=250000){
			System.out.println("You dont need to pay Tax");
		}else if(income>250000 && income<=500000){
			tax = income * 5/100;
		}
		else if(income>500001 && income<=1000000){
			tax = income * 20/100;
		}
		else if(income>1000000){
			tax = income * 30/100;
		}

		System.out.println("Tax : "+tax);

		int amount = income + tax;
		System.out.println("Final Amount after tax : "+amount);
	}
}