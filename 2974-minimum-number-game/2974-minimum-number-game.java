// class Solution {
//     public int[] numberGame(int[] nums) {

//         int[] count = new int[101];
//         int[] rez = new int[nums.length];
//         int idx = 0;
//         for (int num : nums) {
//             count[num]++;
//         }
//         for (int num = 1; num < 101; num++) {
//             while (count[num] > 0) {
//                 int first = num;
//                 count[num]--;
//                 while (count[num] == 0) {
//                     num++;
//                 }
//                 int second = num;
//                 count[num]--;

//                 rez[idx++] = second;
//                 rez[idx++] = first;
//             }
//         }

//         return rez;
//     }
// }

import java.util.Arrays;

class Solution {
    public int[] numberGame(int[] nums) {
        // Step 1: Sort the array in ascending order
        Arrays.sort(nums);
        
        // Step 2: Swap adjacent elements (step by 2)
        for (int i = 0; i < nums.length - 1; i += 2) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        
        return nums;
    }
}