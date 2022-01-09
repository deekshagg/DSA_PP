import java.util.Scanner;

public class Solution {

    public static int diffResult(int N, String A, String B){
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = Integer.parseInt(scn.nextLine().trim());
        String A = scn.nextLine();
        String B = scn.nextLine();
        int result = diffResult(N, A, B);
        System.out.println(result);
    }
}
