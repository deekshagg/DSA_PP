// Java implementation of
// finding length of longest
// Common substring using
// Dynamic Programming
import java.util.*;
public class Main {
	/*
	Returns length of longest common substring
	of X[0..m-1] and Y[0..n-1]
	*/
	static int LCSubStr(java.lang.String s1, java.lang.String s2)
	{
		char X[] = s1.toCharArray();
      char Y[] = s2.toCharArray();
      int m = s1.length();
      int n = s2.length();
		int LCStuff[][] = new int[m + 1][n + 1];
	
		// To store length of the longest
		// common substring
		int result = 0;

		// Following steps build
		// LCSuff[m+1][n+1] in bottom up fashion
		for (int i = 0; i <= m; i++)
		{
			for (int j = 0; j <= n; j++)
			{
				if (i == 0 || j == 0)
					LCStuff[i][j] = 0;
				else if (X[i - 1] == Y[j - 1])
				{
					LCStuff[i][j]
						= LCStuff[i - 1][j - 1] + 1;
					result = Integer.max(result,
										LCStuff[i][j]);
				}
				else
					LCStuff[i][j] = 0;
			}
		}
		return result;
	}

	// Driver Code
	public static void main(String[] args)
	{
		String X = "OldSite:GeeksforGeeks.org";
		String Y = "NewSite:GeeksQuiz.com";

		System.out.println(LCSubStr(X,Y));
	}
}

// This code is contributed by Sumit Ghosh
