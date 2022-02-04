package Leetcode;

class l_525 {
    public int findMaxLength(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum =0;
        for(int i = 0 ; i < nums.length ;i++){
            if(nums[i]==0){
                sum += -1;
            }else{
                sum += 1;
            }
            
            if(map.containsKey(sum)){
                int idx = map.get(sum);
                int len = i - idx;
                if(len>count)
                    count = len;
            }else{
                map.put(sum, i);
            }
        }
        return count;
    }
}
