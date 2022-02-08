package Leetcode;

class l_258 {
    // time_complexity = O(1);
    // space_complexity = O(1);
    public int addDigits(int num) {
        if(num==0) return num;
        return num%9==0?9:num%9;
    }
}