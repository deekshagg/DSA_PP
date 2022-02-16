package Leetcode;

class l_35 {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int mid;
        while(l<=r){
            mid = (l + r)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return l;
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0) return 0;
        int i = 0; 
        int j = nums.length -1;
        int idx = 0;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(nums[mid] < target) i = mid +1;
            else if(nums[mid]>target) j = mid -1;
            else {
                idx = mid;
                break;
            }
        }
        return idx!=0?idx:i;
    }
}