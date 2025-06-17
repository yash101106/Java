public class Arithematic{
    public static void main(String[] args) {
        
        int a = 10;
        int b = 30;

        
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = 0;
        int remainder = 0;

        if (b != 0) {
            quotient = a / b;
            remainder = a % b;
        }

    
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Addition (a + b): " + sum);
        System.out.println("Subtraction (a - b): " + difference);
        System.out.println("Multiplication (a * b): " + product);
        
        if (b != 0) {
            System.out.println("Division (a / b): " + quotient);
            System.out.println("Modulus (a % b): " + remainder);
        } else {
            System.out.println("Division and Modulus not possible (b is zero).");
        }
    }
}
