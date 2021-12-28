import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner scn = new Scanner(System.in);
  int number = scn.nextInt();
  Inverse(number);
 }
 public static void Inverse(int number){
    int inverse = 0; 
    int originalposition = 1;
    while(number>0){
        int originaldigit = number%10;
        int inverseposition = originaldigit;
        int inversedigit = originalposition;

        inverse = inverse + inversedigit * (int)Math.pow(10,inverseposition-1);

        number = number / 10;
        originalposition++;
    }
    System.out.println(inverse);
 }
}
