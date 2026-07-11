// class Solution {
//     public int arraySign(int[] nums) {
//         int prod=1;
//         int sign=1;
//         for(int i=0;i<nums.length;i++){
//             prod*=nums[i];
//         }
//         if(prod==0){
//             return 0;
//         }
//         if(prod<0){
//             sign=-(sign);
//         }
//         return sign;
//     }
// }



class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;
        
        for (int num : nums) {
            if (num == 0) {
                return 0; // Anything multiplied by 0 is 0
            }
            if (num < 0) {
                sign = -sign; // Flip the sign for every negative number
            }
        }
        
        return sign;
    }
}