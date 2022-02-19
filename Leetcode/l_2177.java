class Solution {
    public long[] sumOfThree(long num) {
        if(num%3==0){
            long ans[] = new long[3];
            long k = num/3;
            k = k - 1;
            for(int i = 0 ; i < 3 ; i++){
                ans[i] = k;
                k++;
            }
            return ans;
        }
        return new long[0];
    }
}