// class Solution {
//     public String firstPalindrome(String[] words) {
//         for(int i=0;i<words.length;i++){
//             String rev="";
//             for(int j=words[i].length()-1;j>=0;j--){
//                 rev=rev+words[i].charAt(j);
//             }
//             if(words[i].equals(rev)){
//                 return rev;
//             }
//         }
//         return "";
//     }
// }


class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }
    public boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}