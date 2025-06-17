public class SwitchCase{
    public static void main(String[] args) {
        int a = 12;
        int b = 4;
        int choice = 2; 


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Choice: " + choice);

        switch (choice) {
            case 1:
                System.out.println("Addition : " + (a + b));
                break;

            case 2:
                System.out.println("Subtraction : " + (a - b));
                break;

            case 3:
                System.out.println("Multiplication : " + (a * b));
                break;

            case 4:
                System.out.println("Division : " + (a / b));
                break;

            case 5:
                System.out.println("Modulus : " + (a % b));
                break;

            default:
                System.out.println("Invalid choice. Please choose between 1 and 5.");
        }
    }
}
