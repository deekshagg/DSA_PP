package 1_BasicsOfProgramming.GettingStarted.gcd_and_lcm;

import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int num1 = scn.nextInt();  
      int num2 = scn.nextInt();
      int tempNum1 = num1;
      int tempNum2 = num2;
      while(tempNum1%tempNum2!=0){
          int rem = tempNum1%tempNum2;
          tempNum1 = tempNum2;
          tempNum2 = rem;
      }
      int gcd = tempNum2;
      int lcm = (num1*num2)/gcd;
      System.out.println(gcd + "\n" + lcm);

     }
    }
