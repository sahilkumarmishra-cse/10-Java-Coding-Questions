class Main {

    public int findPeakElement(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        // Fixed input
        int[] nums = { 1, 2, 3, 1 };

        // Creating object
        Main solution = new Main();

        // Calling the LeetCode solution
        int result = solution.findPeakElement(nums);

        // Displaying output
        System.out.println("Input: nums = [1,2,3,1]");
        System.out.println("Output: " + result);
    }
}