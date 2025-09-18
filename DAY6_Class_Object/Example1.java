import java.util.Scanner;
class Student{
	private int rollno;
	private String name;
	private int age;
	
	public void setData(int r, String n, int a){
		rollno = r;
		name = n;
		age = a;
	}
	public void getData(){
		System.out.println("Roll no : "+rollno+", Name : "+name+", Age : "+age);
	}
}
public class Example1{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setData(29,"Dinesh",22);
		Scanner sc = new Scanner(System.in);
		Student s2 = new Student();
		System.out.print("Enter Roll No : ");
		int rn = sc.nextInt();
		System.out.print("Enter Name : ");
		String nm = sc.nextLine();
		sc.nextLine();
		System.out.print("Enter Age : ");
		int ag = sc.nextInt();
		s2.setData(rn, nm, ag);
		System.out.println("Student 1");
		s1.getData();
		System.out.println("Student 2");
		s2.getData();
	}
}