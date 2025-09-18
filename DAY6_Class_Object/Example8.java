// Class and methods: Create a class Calculator with relevant data members and a constructor. 
// Implement methods for basic arithmetic operations (addition, subtraction, multiplication, division, modulus) 
// and demonstrate their usage.
class Calculator{
	double a;
	double b;

	Calculator(double a, double b){
		this.a = a;
		this.b = b;
	}

	public double addition(){
		return a + b;
	}

	public double subtraction(){
		return a - b;
	}

	public double multiplication(){
		return a * b;
	}

	public double division(){
		return a / b;
	}
	public double modulo(){
		return a % b;
	}

	public void display(){
		System.out.println("Side1 : "+a+ " Side2 : "+b);
	}
}
public class Example8{
	public static void main(String[] args) {
		Calculator c1 = new Calculator(25,5);

		System.out.println("Addition : "+c1.addition()); 
		System.out.println("subtraction : "+c1.subtraction()); 
		System.out.println("multiplication : "+c1.multiplication()); 
		System.out.println("division : "+c1.division()); 
		System.out.println("modulo : "+c1.modulo()); 
	}
}