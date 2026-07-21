// class Solution {
//     public boolean halvesAreAlike(String s) {
//         int count = 0;
//         int sum = 0;

//         for (int i = 0; i < s.length() / 2; i++) {
//             if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||
//                 s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
//                 s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' ||
//                 s.charAt(i) == 'O' || s.charAt(i) == 'U') {
//                 count++;
//             }
//         }

//         for (int i = s.length() / 2; i < s.length(); i++) {
//             if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||
//                 s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
//                 s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' ||
//                 s.charAt(i) == 'O' || s.charAt(i) == 'U') {
//                 sum++;
//             }
//         }

//         return count == sum;
//     }
// }


class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
            if (vowels.indexOf(s.charAt(i + n / 2)) != -1) {
                count--;
            }
        }

        return count == 0;
    }
}