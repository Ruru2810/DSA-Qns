// class Solution {
//     public int countPrefixes(String[] words, String s) {
//         int count=0;
//         for(int i=0;i<words.length;i++){
//             if (words[i].length() > s.length()) {
//                 continue;
//             }
//             boolean prefix=true;
//             for(int j=0;j<words[i].length();j++){
//                 if(words[i].charAt(j)!=s.charAt(j)){
//                     prefix=false;
//                 }
//             }
//             if(prefix){
//                 count++;
//             }
//         }

//         return count;
//     }
// }


class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        
        for (String word : words) {
            if (s.startsWith(word)) {
                count++;
            }
        }
        
        return count;
    }
}