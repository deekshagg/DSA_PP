class Solution {
    public int countEven(int num) {
        int count = 0;
        for(int i = 2; i<=num; i++){
            if(digitSum(i)%2==0) count++;
        }
        return count;
    }
    public int digitSum(int num){
        int sum = 0;
        while(num>0){
            int r = num%10;
            num = num/10;
            sum+=r;
        }
        return sum;
    }
}
