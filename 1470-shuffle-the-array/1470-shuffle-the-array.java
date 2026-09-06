class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            result.add(list.get(i));
            result.add(list.get(i + n));
        }

        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}