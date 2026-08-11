class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If the mid element is greater than the rightmost element,
            // the minimum value must be in the right half (excluding mid)
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Otherwise, the minimum value is mid or to the left of mid
                right = mid;
            }
        }

        return nums[left];
    }
}