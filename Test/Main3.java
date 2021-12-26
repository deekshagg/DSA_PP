package Test;

// Duplicated and missing number in an array
// The input nums is supposed to be an array of unique integers
//  ranging from 1 to nums.length (inclusive). However, there is a mistake: 
// one of the numbers in the array
// duplicated, which means another number is missing.
// Find and return the sum of the duplicated number and the missing number.
// Example in the array [4, 3, 3, 1], 3is present twice and 2 is missing, 
// so 3 +2= 5 should be returned.
 

// Java program to Find the repeating
// and missing elements

import java.io.*;

class Main3 {

	static void printTwoElements(int arr[], int size)
	{
		int i;
		// System.out.print("The repeating element is ");
        int duplicate = 0;

		for (i = 0; i < size; i++) {
			int abs_val = Math.abs(arr[i]);
			if (arr[abs_val - 1] > 0)
				arr[abs_val - 1] = -arr[abs_val - 1];
			else
				// System.out.println(abs_val);
                duplicate = abs_val;
		}
        int missing = 0 ;

		// System.out.print("And the missing element is ");
		for (i = 0; i < size; i++) {
			if (arr[i] > 0)
				// System.out.println(i + 1);
                missing = i+1;
		}

        System.out.println(duplicate + missing);
	}

	// Driver code
	public static void main(String[] args)
	{
		int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
		int n = arr.length;
		printTwoElements(arr, n);
	}
}

// This code is contributed by Gitanjali

