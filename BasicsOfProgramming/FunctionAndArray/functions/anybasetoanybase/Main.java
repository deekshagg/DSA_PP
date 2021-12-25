package anybasetoanybase;

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int ans = anybasetoanybase(n,sourceBase,destBase);
     System.out.println(ans);
   }   
   public static int anybasetoanybase(int n, int sourceBase, int destBase){
      
       int dec = anybasetodecimal(n,sourceBase);
       int ans = decimaltoanybase(dec,destBase); 
       return ans;
   }
   public static int decimaltoanybase(int n, int b){
       int ans = 0; 
       int p = 1;
       while(n>0){
           int rem = n%b;
           n = n / b;
           ans += rem*p;
           p*=10;
       }
       return ans;
   }
   public static int anybasetodecimal(int n, int b){
       int ans = 0; 
       int p = 1;
       while(n>0){
           int rem = n%10;
           n = n / 10;
           ans += rem*p;
           p*=b;
       }
       return ans;
   }
  }
