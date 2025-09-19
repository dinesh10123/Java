public class Employee extends Person{
	private int eid;
	private double salary;

	public Employee(String name, int age, int eid, double salary){
		super(name, age);
		System.out.println("Employee constructor called!");
		this.eid = eid;
		this.salary =  salary;
	}

	public int getId(){
		return eid;
	}

	public double getSalary(){
		return salary;
	}

	public void getData(){
		super.getData();
		System.out.println("ID : "+eid);
		System.out.println("Salary : "+salary);
	}
}