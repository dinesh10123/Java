package collection;

public class SetDemo {
	private int id;
	private String name;
	private double salary;
	private String cname;
	public SetDemo(int id, String name, double salary, String cname) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "SetDemo [id=" + id + ", name=" + name + ", salary=" + salary + ", cname=" + cname + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String getCname() {
		return cname;
	}
	
	
}
