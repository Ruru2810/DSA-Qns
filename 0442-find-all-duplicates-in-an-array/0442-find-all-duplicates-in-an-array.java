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
        List<Integer> list = new ArrayList<>();
        int freq[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            freq[val - 1]++;
            if (freq[val - 1] == 2) {
                list.add(val);
            }
        }
        return list;
    }
}