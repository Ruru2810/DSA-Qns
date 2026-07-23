class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int arr[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            arr[i]=heights[i];
        }
        // int arr[]=heights.clone();// Lawde yeh same array ka replica banata hai utna bada function kyun banaya yaad rakh
        Arrays.sort(arr);
        for (int i=0;i<heights.length;i++){
            if(arr[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}