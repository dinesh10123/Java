public class Employee extends Member{
    String specialisation;

	public Employee(String name, int age, long pno, String addr, double salary, String specialisation){
		super(name, age, pno, addr, salary);
		this.specialisation = specialisation;
		}

		@Override
		public void getDetail(){
			super.getDetail();
			System.out.println("Specialisation : "+specialisation);
	}	
}