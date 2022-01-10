import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * element, representing the array with size of element_size.
 * num, representing the integer to be compared(K).
 */
public class Solution
{
	public static int  noOfElement(int[] element, int num)
	{
		int  answer = 0;
		// Write your code here
        for( int i = 0 ; i < element.length ; i++ ){
            if(element[i]<num){
                answer++;
            }
        }
		
		
		return answer;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//input for element
		int element_size = in.nextInt();
		int element[] = new int[element_size];
		for(int idx = 0; idx < element_size; idx++)
		{
			element[idx] = in.nextInt();
		}
		// input for num
		int num = in.nextInt();
		
		
		int result = noOfElement(element, num);
		System.out.print(result);
		
	}
}