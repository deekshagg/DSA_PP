package BasicsOfProgramming.Patterns.Pattern5;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int spaces = n/2;
        int stars  = 1;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= spaces ; j++){
                System.out.print("\t");
            }
            for(int k = 1 ; k <= stars ; k++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                spaces--;
                stars+=2;
            }else{
                spaces++;
                stars-=2;
            }
            System.out.println();
        }

    }
}
