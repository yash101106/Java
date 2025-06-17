public class array {
    public static void main(String[] args) {
        int[][] marks = {
            {85, 90, 78},
            {88, 76, 92}
        };

        int students = 2;
        int subjects = 3;

        System.out.println("Marks of Students:");

        for(int i = 0; i < students; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for(int j = 0; j < subjects; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
