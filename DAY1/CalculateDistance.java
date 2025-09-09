public class CalculateDistance{
	public static void main(String[] args) {
		double distance, miles;
		distance = Double.parseDouble(args[0]);
		System.out.println("Distance in KM :"+args[0]);
		miles = distance * 0.621371;
		System.out.println("Distance in miles: "+ miles);
	}
}