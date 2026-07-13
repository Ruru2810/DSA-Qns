// class Solution {
//     public String truncateSentence(String s, int k) {
//         String[] fruits = s.split(" ");
//         String arr[]=new String[k];
//         for(int i=0;i<k;i++){
//             arr[i]=fruits[i];
//         }
//         return arr;
//     }
// }

class Solution {
    public String truncateSentence(String s, int k) {
        String[] fruits = s.split(" ");
        String arr[] = new String[k];
        
        for(int i = 0; i < k; i++){
            arr[i] = fruits[i];
        }
        return String.join(" ", arr); 
    }
}