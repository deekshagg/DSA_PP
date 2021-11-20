package recursion.on_wayup.print_subsequence_pss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        print_Subsequence(string, "");
    }
    public static void print_Subsequence(String queString, String answer_so_far){
        if(queString.length() == 0){
            System.out.println(answer_so_far);
            return;
        }

        char ch = queString.charAt(0); //x
        String restOfQues = queString.substring(1); //yz
        print_Subsequence(restOfQues, answer_so_far); // "-" -> chahiye nhi hota
        print_Subsequence(restOfQues, answer_so_far + ch);
    }
}
