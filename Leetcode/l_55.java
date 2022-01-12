package Leetcode;

class l_55 {
    public boolean canJump(int[] nums) {
    boolean[]dp = new boolean[nums.length];
    
    dp[dp.length - 1] = true;
   
    for (int i = nums.length - 2; i >= 0; i--)
    {
        boolean canReach = false;
        for (int j = 1; j <= nums[i]; j++)
        {
            if (j + i < dp.length)
            {
                canReach = dp[i+ j];
                if (canReach) {
                    dp[i] = true;
                    break;
                }
            }
        }


    }
   return dp[0];
    }
}