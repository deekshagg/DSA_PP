class Solution {
    public int minimumOperations(int[] nums) {
        Map<Integer,Integer> odd = new HashMap<>();
        Map<Integer, Integer> even = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (i%2 == 0) even.put(nums[i],even.getOrDefault(nums[i],0) + 1);
            else odd.put(nums[i],odd.getOrDefault(nums[i],0) + 1);
        }
        
        int oddNum = 0,whose=0,evenNum = 0;
        for (int key : odd.keySet())
        {
            if(oddNum<odd.get(key))
            {
                oddNum=odd.get(key);
                whose=key;
            }
        }
        for (int key : even.keySet())
        {
            if(key!=whose)
                evenNum = Math.max(evenNum, even.get(key));
        }
        int ans1=nums.length-oddNum-evenNum;
        
        oddNum = 0;
        whose=0;
        evenNum = 0;
        for (int key : even.keySet())
        {
            if(evenNum<even.get(key))
            {
                evenNum=even.get(key);
                whose=key;
            }
        }
        for (int key : odd.keySet())
        {
            if(key!=whose)
                oddNum = Math.max(oddNum, odd.get(key));
        }
        int ans2=nums.length-oddNum-evenNum;
        return Math.min(ans1,ans2);
    }
}