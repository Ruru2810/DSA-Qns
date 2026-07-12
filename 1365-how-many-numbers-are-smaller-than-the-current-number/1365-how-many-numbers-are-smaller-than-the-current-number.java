// class Solution {
//     public int[] smallerNumbersThanCurrent(int[] nums) {
//         int arr[]=new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             int count=0;
//             for(int j=0;j<nums.length;j++){
//                 if(j!=i && nums[j]<nums[i]){
//                     count++;
//                 }
//                 arr[i]=count;
//             }
//         }
//         return arr;
//     }
// }


class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // Step 1: Count the frequency of each number (assuming constraints: 0 <= nums[i] <= 100)
        int[] count = new int[102];
        for (int num : nums) {
            count[num]++;
        }
        
        // Step 2: Transform the count array into a running sum of smaller elements
        int runningSum = 0;
        for (int i = 0; i < count.length; i++) {
            int currentFreq = count[i];
            count[i] = runningSum;
            runningSum += currentFreq;
        }
        
        // Step 3: Build the result array using our precalculated counts
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = count[nums[i]];
        }
        
        return result;
    }
}