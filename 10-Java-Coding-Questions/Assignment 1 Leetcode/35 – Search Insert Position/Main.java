import java.util.Scanner;

class Main {

    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            // Initializing the mid value to move left or the right pointer according to it.
            int mid = left + (right - left) / 2;

            // Now checking the all condition to eithier return the targeted value or
            // updating the refernce of the left or right pointer.
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If not, return the index where it would be if it were inserted in order.
        return left; // Target not found, return the insert position
    }

    // Main function for running the program in VS Code
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking the size of the array
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Creating the array
        int[] nums = new int[n];

        // Taking array elements
        System.out.println("Enter " + n + " sorted elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Taking target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Creating object of Main class
        Main solution = new Main();

        // Calling the LeetCode solution
        int result = solution.searchInsert(nums, target);

        // Displaying result
        System.out.println("Output: " + result);

        sc.close();
    }
}

/*
 * 
 * Let's perform a dry run of the `searchInsert` method with an example input.
 * 
 * Example Input: nums = [1, 3, 5, 6], target = 5
 * Example Output: 2
 * 
 * Dry Run:
 * 1. left = 0, right = 3
 * 2. mid = 1, nums[mid] = 3 < target (5), so left = 2
 * 3. mid = 2, nums[mid] = 5 == target (5), so return 2
 * 
 * for another example input: nums = [1, 3, 5, 6], target = 2
 * Example Output: 1
 * 
 * Dry Run:
 * 1. left = 0, right = 3
 * 2. mid = 1, nums[mid] = 3 > target (2), so right = 0
 * 3. left = 0, right = 0
 * 4. mid = 0, nums[mid] = 1 < target (2), so left = 1
 * 5. left > right, return left (1)
 * 
 * for another example input: nums = [1, 3, 5, 6], target = 7
 * Example Output: 4
 * 
 * Dry Run:
 * 1. left = 0, right = 3
 * 2. mid = 1, nums[mid] = 3 < target (7), so left = 2
 * 3. left = 2, right = 3
 * 4. mid = 2, nums[mid] = 5 < target (7), so left = 3
 * 5. left = 3, right = 3
 * 6. mid = 3, nums[mid] = 6 < target (7), so left = 4
 * 7. left > right, return left (4)
 * 
 */