class Solution {
    public boolean isPalindrome(String s) {
        char arr[]=new char[s.length()];
        int k=0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                arr[k]=Character.toLowerCase(s.charAt(i));
                k++;
            }
        }
        int j=0;
        int l=k-1;
        while(j<l){
            if(arr[j]!=arr[l]){
                return false;
            }
            j++;
            l--;
        }
        return true;
    }
}