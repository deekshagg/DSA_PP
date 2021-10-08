package evenOdd;
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the no. you want to check");
        int number = scan.nextInt();
        if(number%2==0){
            System.out.println(number+" is even");
        }else{
            System.out.println(number+" is odd");
        }
        scan.close();
    }
}