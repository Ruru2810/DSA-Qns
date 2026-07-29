class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int no=0,value=1;
        for(int i=0;i<4;i++){
            int rem1=num1%10;
            int rem2=num2%10;
            int rem3=num3%10;

            int ans=Math.min(rem1,Math.min(rem2,rem3));
            no+=ans*value;
            num1/=10;
            num2/=10;
            num3/=10;
            value*=10;
        }
        return no;
    }
}