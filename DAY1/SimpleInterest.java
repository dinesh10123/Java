public class SimpleInterest{
	public static void main(String[] args) {
		double principle, rate, time;
		principle = Double.parseDouble(args[0]);
		System.out.println("principle : "+ args[0]);
		rate = Double.parseDouble(args[1]);
		System.out.println("Rate : "+ args[1]);
		time = Double.parseDouble(args[2]);
		System.out.println("Time : "+args[2]);
		double interest;
		interest = (principle*rate*time)/100;
		System.out.println("Simple Interest is : " + interest);
	}
}