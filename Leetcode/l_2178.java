import java.util.*;

public class l_2178 {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> ans = new ArrayList<>();
        if(finalSum % 2 != 0)
            return ans;    
        
        for(long i = 2 ; i <= finalSum ; i+=2){
            if(finalSum>0){
                if(finalSum-i == i) continue;
                else{
                  ans.add(i);
                    finalSum-=i;
                } 
            }
        }
        ans.set(ans.size()-1, ans.get(ans.size()-1)+finalSum);
        return ans;
    }
}


/*

In-order to solve this problem, lets understand the concept first -
 
We have to split the given number into unique even numbers, So the first thing that we should remember is :
• A number can be split into even number if it’s a even number
• Odd number cannot be split into even number
 
Here are the rules to split the number into maximum unique even numbers:
• As we all know the first even number is 2, so if we start from the lowest to highest then we can get maximum unique even numbers
• If we divide the number by 2 (for e.g., 28/2 =14) then only possible solution could be to get other even numbers to sum up 14(e.g., 2, 4, 8). So the unique pairs will be 2,4,8,14. In some case like for e.g 30, its not possible as 30/2 = 15
• So its better to find the unique combination other than the /2 values.
 
Next we need to think how to programmatically get the result
• So our rule is to start from the starting even number 2 and subtract the given number from this even number,
• If the value is less than the given num/2 value then add to the result, subsequently increasing the even number to next (+2)
• If the value is equal or greater than the given num/2 then we can directly add the subtracted given number to our result.
Now here is the code for the same :


*/
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