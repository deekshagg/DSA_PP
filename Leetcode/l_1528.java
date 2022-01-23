package Leetcode;

class l_1528 {
    public String restoreString(String s, int[] indices) {
        StringBuilder shuffled = new StringBuilder(s);
        for(int i = 0 ; i < indices.length ; i++){
            shuffled.setCharAt(indices[i],s.charAt(i));
        }
        return shuffled.toString();
    }
}
