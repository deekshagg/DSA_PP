class l_217 {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0)return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++)
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        for(int key : map.keySet()){
            if(map.get(key)>=2) return true;
        }
        return false;
    }
}