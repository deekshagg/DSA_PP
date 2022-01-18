import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern7(n);
    }
    public static void pattern7(int n){
        int sp = 1;
        System.out.println("*");
        for(int i = 1; i < n ; i++){
            for(int j = 1; j <=sp ; j++){
                System.out.print("\t");
            }
            System.out.println("*\t");
            sp++;
        }
    }
}