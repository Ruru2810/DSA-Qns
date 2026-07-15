class Solution {
    public int countDigits(int num) {
        int count=0;
        int rem;
        int ori=num;
        while(num!=0){
            rem=num%10;
            if(ori%rem==0){
                count++;
            }
            num/=10;
        }
        return count;
    }
}