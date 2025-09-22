public class Main{
	public static void main(String[] args) {

		Employee e = new Employee("Dinesh",22,8566,"Jalgaon",500000,"front end developer");

		Manager m = new Manager("Dinesh",22,58665,"Jalgaon",500000,"IT");

		System.out.println("Employee Detail");
		e.getDetail();
		System.out.println("Manager Detail");
		System.out.println("----------------------");
		m.getDetail();
	}
}