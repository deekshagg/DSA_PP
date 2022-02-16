// JAVA program to check whether two strings
// are anagrams of each other
import java.io.*;
import java.util.Arrays;
import java.util.Collections;

class GFG {

	/* function to check whether two strings are
	anagram of each other */
	public String anagramCheck(String input1,String input2)
	{
		// Get lengths of both strings
		char str1[] = input1.toCharArray();
		char str2[] = input2.toCharArray();
		int n1 = str1.length;
		int n2 = str2.length;

		// If length of both strings is not same,
		// then they cannot be anagram
		if (n1 != n2)
			return "no";

		// Sort both strings
		Arrays.sort(str1);
		Arrays.sort(str2);

		// Compare sorted strings
		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return "no";

		return "yes";
	}

	/* Driver Code*/
	public static void main(String args[])
	{
		int a = 15;
		int b = 25; 
		if(a<b){
			continue;
			System.out.println(a);
		}
		else{
			System.out.println(b);
		}
	}
}

// This code is contributed by Nikita Tiwari.
