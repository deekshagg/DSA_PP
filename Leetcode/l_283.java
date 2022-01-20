class l_283{
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[right] == 0){
                right++;
            }else if(nums[right] != 0){
                swap(nums, left, right);
                left++;
                right++;
            }
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}