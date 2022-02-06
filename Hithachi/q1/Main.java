import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {
    public static int numDistinct(int[] arr){
        int n = arr.length;
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++)
        {
            s.add(arr[i]);
        }
        int count = (int) Math.pow(s.size(), 2);
 
        return count;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N;
        N=scan.nextInt();
        int[] A = new int[N];
        for(int j=0;j<N;j++){
            A[j]=scan.nextInt();
        }
        int result;
        result = numDistinct(A);
        System.out.print(result);
        return ;
    }
}