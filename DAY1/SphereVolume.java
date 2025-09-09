public class SphereVolume{
	public static void main(String[] args) {
		double radius, volume;
		radius = Double.parseDouble(args[0]);
		System.out.println("Radius : "+ args[0]);
		volume = (4.0/3.0) * 3.14 * radius * radius * radius;
		System.out.println("Volume of Sphere is "+ volume);
	}
}