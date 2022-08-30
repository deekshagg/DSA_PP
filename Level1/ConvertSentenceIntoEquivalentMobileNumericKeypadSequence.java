//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.printSequence(S));
            
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String printSequence(String S) 
    { 
        String[] arr = {" ", "2", "ABC", "DEF",
                         "GHI", "JKL", "MNO", 
                        "PQRS", "TUV", "WXYZ"};
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
             if(ch == ' ') {
                sb.append(0); 
             }
            for(int j = 2; j < arr.length; j++) {
                if(arr[j].indexOf(ch) == 0) {
                    sb.append(j);
                } else if(arr[j].indexOf(ch) == 1) {
                    sb.append(j + "" + j);
                } else if(arr[j].indexOf(ch) == 2) {
                    sb.append(j + "" + j + "" + j);
                } else if(arr[j].indexOf(ch) == 3){
                    sb.append(j + "" + j + "" + j + "" + j);
                }
            }
        }
        return sb.toString();
    }
}
