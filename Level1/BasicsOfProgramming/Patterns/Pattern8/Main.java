import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern8(n);
    }
    static void pattern8(int n){
        int sp = n-1;
        for(int i = 1; i < n ; i++){
            for(int j = sp ; j > 0 ; j--){
                System.out.print("\t");
            }
            System.out.println("*");
            sp--;
        }
        System.out.println("*");
    }
}