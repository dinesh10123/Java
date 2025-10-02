package collection;

public class EmpDemo {
	private int id;
	private String name;
	private double Salary;
	private String deptname;
	private String organization;
	public EmpDemo(int id, String name, double salary, String deptname, String organization) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		this.deptname = deptname;
		this.organization = organization;
	}
	@Override
	public String toString() {
		return "EmpDemo [id=" + id + ", name=" + name + ", Salary=" + Salary + ", deptname=" + deptname
				+ ", organization=" + organization + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return Salary;
	}
	public String getDeptname() {
		return deptname;
	}
	public String getOrganization() {
		return organization;
	}
	
	
}
