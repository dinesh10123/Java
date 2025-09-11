public class UnaryOp{
	public static void main(String[] args) {
		int a = 10;
		// System.out.println(a++);//
		// int b = a++;
		// System.out.println(a);//
		// System.out.println(b);
		// System.out.println(++a);

		int x = a++ + ++a;
		System.out.println(a);
		System.out.println(x);
	}
}