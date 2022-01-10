package BasicsOfProgramming.GettingStarted.pythagorasTriplet;
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    int max = Math.max(a , Math.max(b,c));
    if(max == a){
      boolean flag = (b*b + c*c == a*a);
      System.out.println(flag);
    }
    else if(max == b){
      boolean flag = (a*a + c*c == b*b);
      System.out.println(flag);
    }
    else{
      boolean flag = (b*b + a*a == c*c);
      System.out.println(flag);
    }
   }
  }