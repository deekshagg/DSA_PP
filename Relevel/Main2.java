package Relevel;
// Chocolate Bar

// Problem Statement


// A class has 12 students. On teachers day, the teacher brought a large chocolate bar of length N.

// You need to cut the chocolate bar such that 12 individual pieces are formed ( 11 cuts ).

// Calculate the total different types of ways you can cut the chocolate bar. 

// Two types of distribution are said to be different if they have at least one cut position that is different.


// Constraints:


// ● 12 <= N <= 205


// Input Format:


// ● Only line N tells us the length of the chocolate

// Output Format:


// Output the different ways to cut the chocolate into 12 pieces.


// Sample Input:


// 13


// Sample Output:


// 12


// Explanation of Sample:


// The ways of cutting the bar are -

// 2 1 1 1 1 1 1 1 1 1 1 1

// 1 2 1 1 1 1 1 1 1 1 1 1

// 1 1 2 1 1 1 1 1 1 1 1 1

// .

// .

// 1 1 1 1 1 1 1 1 1 1 1 2

 

// Things to Note for the Candidate

// You can use your own IDE like Visual Studio Code, Eclipse, or any other IDE that you are comfortable with to build your solution code.
// The IDE provided on the platform is purely for submission. Avoid using the IDE for coding out the solution.
// Test against any custom input in your own IDE. In the IDE provided on the platform, you cannot pass custom test cases and see the output. 
// Use standard input and standard output in your program for the IDE to run the test cases smoothly against your code. We are giving a sample problem statement along with a solution that will pass the test cases in the IDE. - Sample Problem Statement  (Right Click and Open in New Tab to view.)
import java.util.*;
class Main2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = chocolatebars(n);
        System.out.println(ans);
    }
    public static int chocolatebars(int n){
        int ans = 0;
        for(int i = 1 ; i < n ; i++){
            ans++;
        }
        return ans;
    }
}