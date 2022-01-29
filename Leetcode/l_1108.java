package Leetcode;

class l_1108 {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
// 2nd method
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < address.length() ; i++){
            if(address.charAt(i)!='.'){
                sb.append(address.charAt(i));
            }else{
                sb.append("[.]");
            }
        }
        return sb.toString();
    }
}