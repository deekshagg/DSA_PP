package Leetcode;

class l_258 {
    // time_complexity = O(1);
    // space_complexity = O(1);
    public int addDigits(int num) {
        if(num==0) return num;
        return num%9==0?9:num%9;
    }
}

class Solution {
    public int addDigits(int num) {
        if(num==0) return num;
        // naive solution
        int digital_root = 0;
        while(num>0){
            digital_root += num%10;
            num/=10;
            if(num==0&&digital_root>9){
                num = digital_root;
                digital_root = 0;
            }
        }
        return digital_root;
    }
}