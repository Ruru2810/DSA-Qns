class Solution {
    public int addDigits(int num) {
        // int sum=0,rem,rem2,add=0;
        // while(num!=0){
        //     rem=num%10;
        //     sum+=rem;
        //     num/=10;
        // }
        // while(sum!=0){
        //     rem2=sum%10;
        //     add+=rem2;
        //     sum/=10;
        // }
        // return add;



        if(num==0){return 0;}
        return 1+(num-1)%9;
    }
}