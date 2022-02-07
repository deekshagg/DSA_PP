class l_680 {
    public boolean validPalindrome(String s) {
        int l = 0; 
        int r = s.length()-1;
        while(l<=r){
            if(s.charAt(l) != s.charAt(r))
                return validPalindrome(s, l+1, r) || validPalindrome(s,l,r-1);
            l++;
            r--;
        }
        return true;
        
    }
    public boolean validPalindrome(String s, int l , int r) {
        while(l<=r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}