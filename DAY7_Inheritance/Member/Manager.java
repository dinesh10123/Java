public class Manager extends Member{
	 String department;

	public Manager(String name, int age, long pno, String addr, double salary, String department){
		super(name, age, pno, addr, salary);
		this.department = department;
	}
		@Override
		public void getDetail(){
			super.getDetail();
			System.out.println("Department : "+department);
		}
}