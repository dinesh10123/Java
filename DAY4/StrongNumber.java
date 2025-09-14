import java.util.Scanner;
class StrongNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		int sum = 0;
		int temp = n;
		while(temp>0){
			int digit = temp%10;
		
		int fact = 1;
		for(int i=1; i<=digit; i++){
			fact *= i;
		    }
		sum += fact;
		temp = temp/10;
	    }
	    if(n == sum)
	    	System.out.println(n+" is strong Number");
	    else
	    	System.out.println(n+" is not strong number");
	}
}