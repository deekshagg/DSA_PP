import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        function(n);
        

    }
    public static void function(int n) {
        int K = 0, P = 0;
        for (int i = 2; i <= n; i++){
            int x = 0;
            while (n % i == 0){
                n = n / i;
                x++;
            }
            if (x % 2 == 0){
                K++;
            }else{
                P++;
            }
        }
        if (K > P){
            System.out.println("The number is a Strong Number");
        }else{
            System.out.println("The number is not a Strong Number");
        }
    }
}
