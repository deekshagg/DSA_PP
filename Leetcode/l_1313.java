class Solution {
    public int[] decompressRLElist(int[] nums) {
        int anslength = 0;
        for(int i = 0 ; i < nums.length ; i+=2){
            anslength+=nums[i];
        }
        int[] ans = new int[anslength];
        int idx = 0;
        for(int i = 1 ; i < nums.length ; i+=2){
            for(int j = 0 ; j < nums[i-1] ; j++){
                ans[idx] = nums[i];
                idx++;
            }
        }
        return ans;
    }
}
