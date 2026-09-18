class Main {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int low = 0;
        int high = m;

        while (low <= high) {

            int partition1 = low + (high - low) / 2;

            int partition2 = (m + n + 1) / 2 - partition1;

            int maxLeft1;
            int minRight1;
            int maxLeft2;
            int minRight2;

            if (partition1 == 0) {
                maxLeft1 = Integer.MIN_VALUE;
            } else {
                maxLeft1 = nums1[partition1 - 1];
            }

            if (partition1 == m) {
                minRight1 = Integer.MAX_VALUE;
            } else {
                minRight1 = nums1[partition1];
            }

            if (partition2 == 0) {
                maxLeft2 = Integer.MIN_VALUE;
            } else {
                maxLeft2 = nums2[partition2 - 1];
            }

            if (partition2 == n) {
                minRight2 = Integer.MAX_VALUE;
            } else {
                minRight2 = nums2[partition2];
            }

            if (maxLeft1 <= minRight2 &&
                    maxLeft2 <= minRight1) {

                if ((m + n) % 2 == 1) {
                    return Math.max(maxLeft1, maxLeft2);
                }

                return (Math.max(maxLeft1, maxLeft2)
                        + Math.min(minRight1, minRight2)) / 2.0;
            }

            else if (maxLeft1 > minRight2) {
                high = partition1 - 1;
            }

            else {
                low = partition1 + 1;
            }
        }

        return 0.0;
    }

    public static void main(String[] args) {

        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };

        Main solution = new Main();

        double result = solution.findMedianSortedArrays(nums1, nums2);

        System.out.println("Output: " + result);
    }
}