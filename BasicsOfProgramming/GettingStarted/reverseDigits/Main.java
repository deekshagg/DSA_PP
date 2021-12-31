package BasicsOfProgramming.GettingStarted.reverseDigits;

import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int count = (int) Math.log10(n)+1;
     reverseDigits(n,count);
    }
    public static void reverseDigits(int n , int count){
      int ans = 0;
      while(count>0){
        ans = n % 10;
        n = n / 10;
        System.out.println(ans);
        count--;
      }
    }
   }
