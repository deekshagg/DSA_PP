class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> output=new ArrayList<>();
        helper(output,new ArrayList<>(),candidates,0,0,target);
        return output;
    }
    //int pointer to point at current number from candidates
    private void helper(List<List<Integer>> output, ArrayList<Integer> temp,int[] candidates, int pointer,int sum, int target){
        if(pointer>=candidates.length){
            return;
        }
        //If sum is bigger we need to remove last element and try again
        if(sum>target){
            return;
        }
        if(sum==target){
            //Found so add in output
            output.add(new ArrayList<>(temp));
            return;
        }
		//Add to temp and find current sum
        temp.add(candidates[pointer]);
        sum=sum+candidates[pointer];
		//Recursive call
        helper(output,temp,candidates,pointer,sum,target);
        //Remove last element
        if(!temp.isEmpty()){
            sum=sum-temp.get(temp.size()-1);
            temp.remove(temp.size()-1);
        }else{
            //if list is empty, make sum=0
            sum=0;
        }
        //Increment pointer and try again as sum was greater than target
        helper(output,temp,candidates,pointer+1,sum,target);
        return;
    }
}
