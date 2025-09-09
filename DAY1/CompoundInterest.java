// public class CompoundInterest {
//     public static void main(String[] args) {
//         double principal, rate, inte, time;

//         // Read values from command line
//         principal = Double.parseDouble(args[0]);
//         System.out.println("Principal : " + principal);

//         rate = Double.parseDouble(args[1]);
//         System.out.println("Rate (% per year) : " + rate);

//         inte = Double.parseDouble(args[2]);
//         System.out.println("Compounds per year : " + inte);

//         time = Double.parseDouble(args[3]);
//         System.out.println("Time (years) : " + time);

//         // Convert rate to decimal
//         double Comp = principal * Math.pow((1 + (rate / 100) / inte), inte * time);

//         double CI = Comp - principal;
//         System.out.println("Compound Interest is " + CI);
//         System.out.println("Total Amount is " + Comp);
//     }
// }


public class CompoundInterest{
	public static void main(String[] args) {
		double principle, rate, inte, time;
		principle = Double.parseDouble(args[0]);
		System.out.println("Principle : "+ principle);
		rate = Double.parseDouble(args[1]);
		System.out.println("Rate : "+ rate);
		inte = Double.parseDouble(args[2]);
		System.out.println("Compounds per year : "+ inte);
		time = Double.parseDouble(args[3]);
		System.out.println("Time : "+ time);

		double Comp = principle * Math.pow((1 + (rate / 100) / inte), inte * time);


		double CI = Comp - principle;
		System.out.println("Compound Interest is "+ CI);
		System.out.println("Total Amount is  "+ Comp);
	}
}

