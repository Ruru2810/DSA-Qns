class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0;
        int sum2=0;
        int rem;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
            int temp=nums[i];
            while(temp!=0){
                rem=temp%10;
                sum2+=rem;
                temp/=10;
            }
        }
        return sum1-sum2;
    }
}