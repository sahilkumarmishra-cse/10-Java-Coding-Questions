import java.util.Arrays;

class Main {

    public int[] sortArray(int[] nums) {

        mergeSort(nums, 0, nums.length - 1);

        return nums;
    }

    private void mergeSort(int[] nums, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);

        merge(nums, low, mid, high);
    }

    private void merge(int[] nums, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {

            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }

            k++;
        }

        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }

        while (j <= high) {
            temp[k] = nums[j];
            j++;
            k++;
        }

        for (int x = 0; x < temp.length; x++) {
            nums[low + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        // Fixed input
        int[] nums = { 5, 2, 3, 1 };

        System.out.println("Input: " + Arrays.toString(nums));

        // Creating object
        Main solution = new Main();

        // Calling the LeetCode solution
        int[] result = solution.sortArray(nums);

        // Displaying output
        System.out.println("Output: " + Arrays.toString(result));
    }
}