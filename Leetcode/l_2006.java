package Leetcode;

class l_2006 {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        for(int i = 0 ; i < nums.length ; i++){
            int m = i; 
            for(int j = i+1 ; j < nums.length ; j++){
                if(Math.abs(nums[m] -nums[j]) == k){
                    count++;
                }
            }
        }
        return count;
    }
}
