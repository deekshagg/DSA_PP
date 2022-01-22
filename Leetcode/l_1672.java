package Leetcode;

class l_1672 {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for(int i = 0 ; i < accounts.length ; i++){
            int sum = 0;
            for(int j = 0 ; j < accounts[0].length ; j++){
                sum += accounts[i][j];
                if(sum > wealth)
                    wealth = sum;
            } 
        }
        return wealth;
    }
}
