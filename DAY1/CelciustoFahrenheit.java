public class CelciustoFahrenheit {
    public static void main(String[] args){
        double Celsius, Fahrenheit;
        Celsius = Double.parseDouble(args[0]);
        System.out.println("Celsius : "+args[0]);
        Fahrenheit = (Celsius * 9/5) + 32;
        System.out.println("Fahrenheit : "+ Fahrenheit);
    }
}
