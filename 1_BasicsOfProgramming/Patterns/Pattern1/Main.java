package Getting_started.Patterns.Pattern1;
// import java.util.*;
// public class Main{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i =1 ; i<=n ; i++){
//             for(int j=1 ; j<=i; j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        // *
        // *    *
        // *    *   *
        // *    *   *   *
        // *    *   *   *   *
        int n = scn.nextInt();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}