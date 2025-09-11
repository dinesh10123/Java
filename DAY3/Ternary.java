public class Ternary{

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int greater = (a>b && a>c) ? a : (b>c ? b : c);
		System.out.println("Greater Number is "+ greater);
	}
}