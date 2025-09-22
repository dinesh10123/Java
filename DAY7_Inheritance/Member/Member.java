// 6. Create a class named 'Member' having the following members: 
// Data members: 1 – Name, 2 – Age, 3 - Phone number, 4 – Address, 5 - Salary
// It also has a method named 'printSalary' which prints the salary of the members.
//  Two classes 'Employee' and 'Manager' inherits the 'Member' class. 
//  The 'Employee' and 'Manager' classes have data members'specialization' and 'department' respectively.
//  Now, assign name, age, phone number, address and salary to an employee and a manager
//   by making an object of both of these classes and print the same.
public class Member{
	 String name;
	 int age;
	 long pno;
	 String addr;
	 double salary;

	public Member(String name, int age, long pno, String addr, double salary){
		this.name = name;
		this.age = age;
		this.pno = pno;
		this.addr = addr;
		this.salary = salary;
	}

	public void printSalary(){
		System.out.println("Salary : "+salary);
	}

	public void getDetail(){
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Phone Number : "+pno);
		System.out.println("Address : "+addr);
		System.out.println("Salary : "+salary);
		printSalary();
	}
}