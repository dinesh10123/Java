public class Employee extends Person{
	private int empid;
	private double salary;

	public Employee(String name, int age, int empid, double salary){
		super(name, age);
		this.empid = empid;
		this.salary = salary;
	}

	public int getId(){
		return empid;
	}

	public double getSalary(){
		return salary;
	}

	public void getDetail(){
		super.getDetail();
		System.out.println("ID : "+empid);
		System.out.println("Salary : "+salary);
	}
}