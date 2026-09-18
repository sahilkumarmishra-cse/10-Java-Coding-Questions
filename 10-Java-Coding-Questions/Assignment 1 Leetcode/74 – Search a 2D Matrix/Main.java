import java.util.Scanner;

class Main {

    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0;
        int high = rows * cols - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Taking number of columns
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Creating the matrix
        int[][] matrix = new int[rows][cols];

        // Taking matrix elements
        System.out.println("Enter " + (rows * cols) + " elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Taking target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Creating object
        Main solution = new Main();

        // Calling LeetCode solution
        boolean result = solution.searchMatrix(matrix, target);

        // Displaying result
        System.out.println("Output: " + result);

        sc.close();
    }
}