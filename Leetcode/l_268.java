class l_268 {
    public int missingNumber(int[] nums) {
        int range = nums.length;
        // sum of n natural numbers
        int sumOfNNaturalNumbers = (range * (range + 1)) / 2;

        int sum = 0;
        for (int i = 0; i < range; i++) {
            sum += nums[i];
        }
        return sumOfNNaturalNumbers - sum;
    }
}