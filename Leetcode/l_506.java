package Leetcode;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int [] arr = new int[score.length];
        for(int i = 0; i < score.length; i++){
            arr[i] = score[i];
        }
        String[] ans = new String[score.length];
        
        Arrays.sort(arr);
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = arr.length - 1; i >= 0; i--){
            hm.put(arr[i], arr.length - i);
        }
        
        for(int i = 0; i < score.length; i++){
            int val = hm.get(score[i]);
            if(val == 1){
                ans[i] = "Gold Medal";
            }else if(val == 2){
                ans[i] = "Silver Medal";
            }else if(val == 3){
                ans[i] = "Bronze Medal";
            }else{
                ans[i] = val + "";
            }
        }
        return ans;
    }
}
