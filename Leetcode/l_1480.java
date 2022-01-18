class l_1480 {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = nums[0];
        for(int i = 0; i < nums.length ; i++){
            result[i] = sum;
            if(i<nums.length-1)
            sum+=nums[i+1];
            
        }
        return result;
    }
}
