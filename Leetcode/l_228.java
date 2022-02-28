class l_228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length == 0)
            return ans;
        if(nums.length == 1){
            ans.add(nums[0] + "");
            return ans;
        }
        for(int i = 0; i < nums.length ; i++){
            int j = i;
            while(j+1 < nums.length && nums[j+1]-1 == nums[j]){
                j++;
            }
            if(j==i){
                ans.add(nums[j]+"");
            }else{
                ans.add(nums[i] + "->" + nums[j]);
            }
            i=j;
        }
        return ans;
            
    }
}

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList();
        if(nums.length==1){
            list.add(nums[0]+"");
            return list;
        }
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            while(i+1<nums.length&&(nums[i+1]-nums[i])==1){
                i++;
            }
            if(a!=nums[i]){
                list.add(a+"->"+nums[i]);
            }else{
                list.add(a+"");
            }
        }
        return list;
    }
}