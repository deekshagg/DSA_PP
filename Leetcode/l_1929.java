package Leetcode;

class l_1929 {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n+n];
        for(int i = 0 ; i < n ; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
