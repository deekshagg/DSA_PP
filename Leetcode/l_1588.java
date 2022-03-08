package LeetCode;

class l_1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int e = i+1;
            int s = arr.length-i;
            int t= s*e;
            int o = t/2;
            if(t%2!=0) o++;
            sum+=o*arr[i];
        }
        return sum;
    }
}
// Input: arr = [1,4,2,5,3]
// Output: 58