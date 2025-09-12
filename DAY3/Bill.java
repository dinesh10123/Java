import java.util.Scanner;
public class Bill{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Unit : ");
		int charges; 
		int unit = sc.nextInt();

		if(unit<=100){
			charges = unit * 5;
		}else if(unit>100 && unit<=200){
			charges = unit * 6;
		}else if(unit>200 && unit<=300){
			charges = unit * 7;
		}else{
			charges = unit * 8;
		}

		
		System.out.println("Bill : "+charges);

		
	}
}