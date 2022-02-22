class Solution {
    public int titleToNumber(String s) {
        
        int sum=0;
        for(int i=0; i<s.length(); i++ ){
            char ch = s.charAt(i);
            int val = ((ch - 65)+1)*power((s.length()-1)-i);
            sum+=val;
        }
        return sum;
        
    }
    
    public int power(int p){
        
        if(p==0){
            return 1;
        }
        if(p==1){
            return 26;
        }
        
        int ph = power(p/2);
        int total = ph*ph;
        
        if(p%2==1){
            return total*26;
        }
        return total;
    }
}