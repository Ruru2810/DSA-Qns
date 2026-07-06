class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int sum=0;
        while(count <g.length && sum<s.length){
            if(g[count]<=s[sum]){
                count++;
            }
            sum++;
        }
        return count;
    }
}