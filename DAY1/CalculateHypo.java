public class CalculateHypo{
	public static void main(String[] args) {
		double s1, s2, hypo;
		s1 = Double.parseDouble(args[0]);
		System.out.println("Side 1 : "+ s1);
		s2 = Double.parseDouble(args[1]);
		System.out.println("Side 2: "+ s2);
		hypo = Math.sqrt(s1*s1+s2*s2);
		System.out.println("Hypotenuse : "+ hypo);
	}
}