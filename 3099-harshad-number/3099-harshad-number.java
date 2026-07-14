class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0,rem;
        int ori=x;
        while(x!=0){
            rem=x%10;
            sum+=rem;
            x/=10;
        }
        if(ori%sum==0){
            return sum;
        }
        return -1;
    }
}