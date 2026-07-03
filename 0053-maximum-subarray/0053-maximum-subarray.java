class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize with the first element
        int maxSoFar = nums[0];
        int currentMax = nums[0];
        
        // Iterate through the rest of the array
        for (int i = 1; i < nums.length; i++) {
            // Decide whether to add the current element to the existing subarray
            // or start a new subarray from the current element
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            
            // Keep track of the overall maximum sum found so far
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        
        return maxSoFar;
    }
}