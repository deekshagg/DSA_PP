class l_58 {
    public int lengthOfLastWord(String s) {
        int r = 0;
        int n = s.length();
        while(n>0){
            if(s.charAt(--n) != ' ')
                r++;
            else if(r>0)
                return r;
        }
        return r;
    }
}
