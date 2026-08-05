// import java.util.ArrayList;
// import java.util.List;

// class Solution {
//     public int[] createTargetArray(int[] nums, int[] index) {
//         List<Integer> list = new ArrayList<>();
//         for (int i = 0; i < nums.length; i++) {
//             list.add(index[i], nums[i]);
//         }
//         int[] target = new int[nums.length];
//         for (int i = 0; i < nums.length; i++) {
//             target[i] = list.get(i);
//         }
        
//         return target;
//     }
// }


//0% beat bc but kyunnnnnnnnnnnnnnnn 🤬🤬


class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            a.add(index[i],nums[i]);
        }
        int target[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            target[i] = a.get(i);
        }
        return target;
    }
}