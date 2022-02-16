package Leetcode;
// binary search algorithm
// time complexity - O(logn)
class l_704 {
    public int search(int[] nums, int target) {
        if(nums.length == -1) return -1;
        int i = 0;
        int j = nums.length-1;
        while(i <= j){
            int mid = i + (j-i)/2;
            if(nums[mid]<target){
                i = mid + 1;
            }
            else if(nums[mid]>target){
                j = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
        
    }
}