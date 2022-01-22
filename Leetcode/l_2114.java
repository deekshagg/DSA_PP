package Leetcode;

class l_2114 {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for(int i = 0 ; i < sentences.length ; i++){
            String string = sentences[i];
            int c = string.split(" ").length;
            if(c>count)
                count = c;
        }
        return count;
    }
}