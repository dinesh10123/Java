// Define a base class Person and a derived class employee with single inheritance.
//  Define SetData() member functions in each of the class with different signatures 
//  to set the data members and demonstrate overloading of member functions.
//  Define GetData() member functions in each of the class with same signatures to display data 
//  and demonstrate overriding of member functions.
public class Person{
	private String name;
	private int age;

	public void setData(String name, int age){
		this.name = name;
		this.age = age;
	}
    
    public void getData(){
    	System.out.println("Name : "+name);
    	System.out.println(" Age : "+age);
    }

}