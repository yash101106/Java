// An array is a collection of elements of the same data type stored in contiguous memory locations.
//It allows you to store multiple values in a single variable, instead of declaring separate variables for each value.
// Note: It is very important to note that the array index starts with 0. 

public class chararray {
    public static void main(String[] args) {
        // Declare and initialize a 2D char array
        char[][] letters = {
            {'A', 'B', 'C'},
            {'D', 'E', 'F'},
            {'G', 'H', 'I'}
        };

        // Print the 2D char array without using .length
        System.out.println("2D Character Array:");

        // We know it’s a 3x3 array
        for (int i = 0; i < 3; i++) {         // rows
            for (int j = 0; j < 3; j++) {     // columns
                System.out.print(letters[i][j] + " ");
            }
            System.out.println();
        }
    }
}
