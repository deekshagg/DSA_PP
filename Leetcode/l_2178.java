class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> res = new ArrayList<Long>();
        if(finalSum%2==1)
            return res;
        Long num = (long) 2;
        if(finalSum==4)
            num = (long) 4;
        while(finalSum>0){
            finalSum = finalSum - num;
            res.add(num);
            if(num+2<finalSum/2)
                num = num+2;
            else
                num = finalSum;
        }
        return res;
    }
}