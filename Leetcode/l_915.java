class Solution {
    public int partitionDisjoint(int[] nums) {
        int res = 0;
        int leftMax = nums[0];
        int greater = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (greater <= nums[i]) {
                greater = nums[i];
            } else if (nums[i] < leftMax) {
                res = i;
                leftMax = greater;
            }
        }
        return res + 1;
    }
}