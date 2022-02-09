package Leetcode;

class l_532 {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        if(k<0) return 0;
        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Integer i : map.keySet()){
            if(k==0){
                if(map.get(i) >= 2)
                    count++;
            }
            else{
                if(map.containsKey(i+k))
                    count++;
            }
        }
        return count;
    }
}