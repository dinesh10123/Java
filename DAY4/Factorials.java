public class Factorials {
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + n + " = " + fact);
        }
    }
}
