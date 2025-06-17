public class Factorial{

    public static int factorial(int num) {
        int fact = 1;
        for(int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int a = 6;
        int result = factorial(a);
        System.out.println("The factorial of " + a + " is: " + result);
    }
}
