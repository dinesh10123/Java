public class Teacher extends Employee{
	private String subject;

	public Teacher(String name, int age, int empid, double salary, String subject){
		super(name, age, empid, salary);
		this.subject = subject;
	}

	public String getSub(){
		return subject;
	}

	public void getDetail(){
		super.getDetail();
		System.out.println("Subject : "+subject);
	}
}