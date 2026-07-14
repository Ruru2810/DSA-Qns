class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){sum+=nums[i];}
            else{n+=nums[i];}
        }
        if(sum!=n){
            return true;
        }
        return false;
    }
}