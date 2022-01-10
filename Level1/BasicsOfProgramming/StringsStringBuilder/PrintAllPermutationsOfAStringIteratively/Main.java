import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		int n = str.length();
        int factnum = factorial(n);
        for(int i = 0 ; i < factnum ; i++){
            int temp = i;
            StringBuilder sb = new StringBuilder(str);
            for(int div = n ; div >= 1 ; div--){
                int q = temp / div;
                int r = temp % div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }
        
		
	}

    public static int factorial(int n){
        int fact = 1;
        for(int i = 2 ; i<=n ;i++ ){
            fact*=i;
        }
        return fact;
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}