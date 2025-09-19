public class Main{
	public static void main(String[] args) {
		Box b1 = new Box(4,5);
		System.out.println("Area : "+b1.area());

		Box3d b2 = new Box3d(6,8,7);
		System.out.println("Area : "+b2.area());
		System.out.println("Volume : "+b2.volume()); 
	}
}