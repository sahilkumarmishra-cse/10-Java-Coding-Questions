class Main {

    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {

                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            }

            else {

                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        // Fixed input
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        // Creating object
        Main solution = new Main();

        // Calling the LeetCode solution
        int result = solution.search(nums, target);

        // Displaying output
        System.out.println("Input: nums = [4,5,6,7,0,1,2], target = 0");
        System.out.println("Output: " + result);
    }
}