public class SumofNaturalNo{
	public static void main(String[] args) {
		int sum = 0;
		int n = Integer.parseInt(args[0]);
		System.out.println("Natural Number : "+ n);
		sum += (n * (n + 1)) / 2;
		System.out.println("Sum is : " + sum);
	}
}