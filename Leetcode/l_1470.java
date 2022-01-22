package Leetcode;

class l_1470 {
    // brute force approach
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n+n];
        int j = 0;
        for(int i = 0 ; i < ans.length ; i+=2){
            ans[i] = nums[j];
            ans[i+1] = nums[j+n];
            j++;
        }
        return ans;
    }
}