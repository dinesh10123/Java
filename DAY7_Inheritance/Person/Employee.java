public class Employee extends Person{
    private int eid;
	private double salary;
	private String role;

	public void setData(String name, int age, int eid, double salary, String role){
		super.setData(name, age);
		this.eid = eid;
		this.salary = salary;
		this.role = role;
	}
	@Override
	public void getData(){
		super.getData();
		System.out.println("Employee Id : "+eid);
		System.out.println("Salary : "+salary);
		System.out.println("Role : "+role);
	}
}