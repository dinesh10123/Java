
public class AreaofCircle {
    public static void main(String[] args){
        double radius = Double.parseDouble(args[0]);
        System.out.println("Radius : "+args[0]);
        double area = 3.14 * radius * radius; 
        System.out.println("Area of Circle is " + area);
    }
}
