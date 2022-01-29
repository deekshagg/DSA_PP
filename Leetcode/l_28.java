package Leetcode;

class l_28 {
    public int strStr(String haystack, String needle) {
        if(needle == null)  return 0;
        return haystack.indexOf(needle,0); 
    }
}