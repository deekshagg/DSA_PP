package DecimalToAnyBase;

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int power = 1;
       
       int ans = 0; 
       while(n>0){
           int rem = n%b;
           ans += (rem*power);
            n = n / b;
            power*=10;
       }
       return ans;
   }
  }
