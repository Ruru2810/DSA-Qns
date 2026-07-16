class Solution {
    public int scoreOfString(String s) {
        int diff = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            diff += Math.abs(s.charAt(i) - s.charAt(i + 1));//yaad rakkh lavde ki Math.abs -ve ko +ve mein kar kardeta hai i mean ki absolutte value mein convert kar deta haai  
        }
        
        return diff;
    }
}