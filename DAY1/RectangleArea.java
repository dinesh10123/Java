public class RectangleArea {
    public static void main(String[] args){
        int length, breadth, area;
        length = Integer.parseInt(args[0]);
        System.out.println("Length : "+args[0]);
        breadth = Integer.parseInt(args[1]);
        System.out.println("Breadth : "+args[1]);
        area = length * breadth;
        System.out.println("Area of Rectangle is " + area);
    }
}
