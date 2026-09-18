import java.util.Scanner;

// LeetCode Problem 704: Binary Search

class Main {

    // LeetCode Solution
    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    // Main function for running in VS Code
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Create array
        int[] nums = new int[n];

        // Input sorted array
        System.out.println("Enter " + n + " sorted elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Call LeetCode solution
        int result = search(nums, target);

        // Display result
        System.out.println("Output: " + result);

        sc.close();
    }
}