class l_521 {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)) return -1;
        return a.length()>b.length()?a.length():b.length();
    }
}
class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)) return -1;
        return Math.max(a.length(),b.length());
    }
}