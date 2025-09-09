public class AreaofTriangle{
	public static void main(String[] args) {
		double a,b,c,s,area;
		a = Integer.parseInt(args[0]);
		System.out.println("side 1 : "+ a);
		b = Integer.parseInt(args[1]);
		System.out.println("side 2 : "+ b);
		c = Integer.parseInt(args[2]);
		System.out.println("side 3 : "+ c);
		s = (a + b + c) / 2;
		area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("Area of Triangle : "+ area);


	}
}




// s = (a + b + c) / 2
// A = sqrt(s * (s - a) * (s - b) * (s - c))
// where:
// a, b, and c are the lengths of the triangle's sides.
// s is the semi perimeter (half of the perimeter) of the triangle.
// A is the area of triangle