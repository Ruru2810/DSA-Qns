class Solution {
    public int reverse(int x){
        long a=x;
        long digit,rev=0;
        while(a!=0){
            digit=a%10;
            rev=rev*10+digit;
            a=a/10;
        }
        if(rev<=Integer.MIN_VALUE || rev>Integer.MAX_VALUE) return 0;
        return (int)rev; 
    }
}