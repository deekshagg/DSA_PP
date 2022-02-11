package Leetcode;
class l_494 {
    public int findTargetSumWays(int[] nums, int target) {
        return targetSum(nums, 0, 0, target);
    }
    public int targetSum(int[] arr, int idx, int sos, int tar){
        if(arr.length == idx){
            return sos == tar?1:0;
        }
        
        return targetSum(arr, idx+1, sos-arr[idx], tar)+
        targetSum(arr, idx+1, sos+arr[idx], tar);
    }
}