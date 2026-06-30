// class Solution {
//     public int[] plusOne(int[] digits) {
//         if(digits.length==1){
//             System.out.print(1);
//         }
//         digits[digits.length-1]=digits[digits.length-1]+1;
//         if(digits.length<2){
//             int arr[]=new int[digits.length+1];
//             if(arr.length>1){
//             arr[0]=digits[0]/10;
//             arr[1]=0;
//             return arr;
//             }
//         }
//         return digits;
//     }
// }

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + 1;
            if (digits[i] < 10) {
                return digits;
            }
            digits[i] = 0;
        }
        int arr[] = new int[digits.length + 1];
        arr[0] = 1; 
        return arr;
    }
}