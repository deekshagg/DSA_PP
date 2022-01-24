class l_1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = nums.length -1; j > index[i] ; j--){
                target[j] = target[j-1];
            }
            target[index[i]] = nums[i];
        }
        return target;
    }
}