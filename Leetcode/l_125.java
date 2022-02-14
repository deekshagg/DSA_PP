class Solution {
    public boolean isPalindrome(String s) {
//         String ans = "";
//         for(char c : s.toCharArray()){
//             if(Character.isDigit(c) ||Character.isLetter(c)){
//                 ans += c;
//             }
//         }
//         ans = ans.toLowerCase();
//         int i = 0;
//         int j = ans.length()-1;
//         while(i<=j){
//             if(ans.charAt(i)!=ans.charAt(j))
//                 return false;
//             i++;
//             j--;
//         }
        
//         return true;
        s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}