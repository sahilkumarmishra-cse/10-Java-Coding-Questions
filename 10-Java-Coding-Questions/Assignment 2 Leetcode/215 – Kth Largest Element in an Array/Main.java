import java.util.Arrays;

class Main {

    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);

        return nums[nums.length - k];
    }

    public static void main(String[] args) {

        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k = 2;

        Main solution = new Main();

        int result = solution.findKthLargest(nums, k);

        System.out.println("Input: nums = " + Arrays.toString(nums));
        System.out.println("Input: k = " + k);
        System.out.println("Output: " + result);
    }
}