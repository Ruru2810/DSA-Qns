// class Solution {
//     public int pivotIndex(int[] nums) {
//         int sum=0;
//         int count=0;
//         int i=0;
//         int j=nums.length-1;
//         int ans=0;
//         while(i<nums.length/2 && j>j/2){
//             sum+=nums[i];
//             count+=nums[j];
//             i++;
//             j--;
//             if(sum!=count){
//                 ans=i;
//             }
//         }
//         return ans;
//     }
// }




class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        int k = 0;
        while (k < nums.length) {
            totalSum += nums[k];
            k++;
        }
        
        int i = 0;
        while (i < nums.length) {
            int rightSum = totalSum - leftSum - nums[i];
            
            if (leftSum == rightSum) {
                return i; 
            }
            
            leftSum += nums[i]; 
            i++;
        }
        
        return -1;
    }
}