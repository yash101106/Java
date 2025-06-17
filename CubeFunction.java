public class CubeFunction {

    public static int cube(int num) {
        return num * num * num;
    }

    public static void main(String[] args) {
        int a = 4;
        int result = cube(a);
        System.out.println("The cube of " + a + " is: " + result);
    }
}
