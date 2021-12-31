package BasicsOfProgramming.GettingStarted.TheCuriousBenjaminBulb;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int number = scn.nextInt();
        for(int i = 1 ; i * i <=number ; i++){
            System.out.println(i*i);
        }
    }
}
