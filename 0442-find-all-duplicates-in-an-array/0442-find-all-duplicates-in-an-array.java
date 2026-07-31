// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         List<Integer> result = new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     result.add(nums[i]);
//                     break;
//                 }
//             }
//         }
//         return result;
//     }
// }






class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                ans.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }
        return ans;
    }
}
