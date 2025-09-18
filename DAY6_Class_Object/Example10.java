// . Write a Java class representing a Student. Encapsulate the student's name, age,
//  and grade point average (GPA) with private access modifiers. 
// Provide getter and setter methods to access and modify these attributes 
class Student{
	private String name;
	private int age;
	private double GPA;

	public void setName(String name){
		this.name = name;
	} 
	public void setAge(int age){
		this.age = age;
	}
	public void setGPA(double GPA){
		this.GPA = GPA;
	}

	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public double getGPA(){
		return GPA;
	}
	public void display(){
		System.out.println("Name : "+name+", Age : "+age+", GPA : "+GPA);
	}
}
public class Example10{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Dinesh");
		s1.setAge(22);
		s1.setGPA(7.77);
		s1.display();
	}
}