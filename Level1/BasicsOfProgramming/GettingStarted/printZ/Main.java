package BasicsOfProgramming.GettingStarted.printZ;
// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         System.out.println("*****");
//         System.out.println("   *");
//         System.out.println("  *");
//         System.out.println(" *");
//         System.out.println("*****");

//     }
// }

// import java.util.*;

public class Main {

  public static void main(String[] args) {
    int n = 5;
    
    for(int j = 1 ; j <=n ; j++){
      System.out.print("*");
    }
    System.out.println();
    for(int i = 2 ; i <=n-1  ; i++){
      for(int k = n-1 ; k >= 2 ; k--){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int j = 1 ; j <=n ; j++){
      System.out.print("*");
    }
  
  }
}