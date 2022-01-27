class l_9 {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp = x;
        int rtemp = 0;
        while(temp>0){
            int ld = temp % 10;
            rtemp = rtemp * 10 + ld;
            temp = temp/10;
        }
        if(rtemp == x) return true;
        else return false;
    }
}