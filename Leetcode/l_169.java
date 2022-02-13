package Leetcode;

class l_169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(map.get(nums[i])> nums.length/2){
                ans = nums[i];
            }
        }
        return ans;
    }
}
