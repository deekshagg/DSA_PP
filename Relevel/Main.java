package Relevel;
// Problem Statement

// You are given an array A = A1, A2, ..., AN of length N, and an integer M.

// Consider an array B = B1, B2, ..., BN  of length N that satisfy the following condition: -
// Array B is a permutation of 1 to N.
// (Ai = Bi mod M) holds for every 1 <= i <= N.

// If there are several possible arrays, output the lexicographically minimal permutation B you can obtain.


// Constraints

// 1 <= T <= 10

// 1 <= N, M <= 10^4

// 0<= Ai < M


// Input Format

// The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
// The first line of each test case contains two space-separated integers N, and M.
// The second line contains N space-separated integers A1, A2, …, AN.


// Output Format

// For each test case, if there is a valid B, output one line consisting of N integers which represent B. if there is no valid B, output one line consisting of “-1” (without quotation marks).


// Sample Input

// 2

// 5 3

// 2 0 1 1 2

// 2 2

// 0 0


// Sample Output

// 2 3 1 4 5

// -1


// Explanation of Sample

// Sample case 1: In this case, we construct array B = {2,3,1,4,5}, which satisfies the above conditions and it is a lexicographically minimal array.
// Sample case 2: In this case, it is impossible to construct array B.

 

// Things to Note for the Candidate

// You can use your own IDE like Visual Studio Code, Eclipse, or any other IDE that you are comfortable with to build your solution code.
// The IDE provided on the platform is purely for submission. Avoid using the IDE for coding out the solution.
// Test against any custom input in your own IDE. In the IDE provided on the platform, you cannot pass custom test cases and see the output. 
// Use standard input and standard output in your program for the IDE to run the test cases smoothly against your code. We are giving a sample problem statement along with a solution that will pass the test cases in the IDE. - Sample Problem Statement  (Right Click and Open in New Tab to view.)

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int testcase = scn.nextInt();
        for(int i = 0 ; i < testcase ; i++){
            int N = scn.nextInt();
            int M = scn.nextInt();
            int[] arr = new int[N];
            for(int j = 0 ; j < N ; j++){
                arr[j] = scn.nextInt();
            }
            permutations(N, M, arr);
        }
    }
    public static void permutations(int N, int M, int A[]){
        int B[] = new int[N];
        for(int i = 0 ; i < N ;i++){
            B[i] = A[i]%N;
        }
        for(int i = 0 ; i < N ; i++){
            System.out.print(B[i] + " ");
        }
    }
}