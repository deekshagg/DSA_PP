package recursion.withArrayList.get_subsequence_gss;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        ArrayList<String> substring = get_Subsequence(str);
        System.out.println(substring);
    }
    // xyz = --- , --z , -y- , -yz , x-- , x-z , xy- , xyz
    // yz = -- , -z , y- , yz
    public static ArrayList<String> get_Subsequence(String str){

        // base case 
        if(str.length() == 0 ){
            ArrayList<String> base_result = new ArrayList<>();
            base_result.add("");
            return base_result; 
        }
        char ch = str.charAt(0); //x
        String restOfString = str.substring(1); //yz
        ArrayList<String> recursion_result = get_Subsequence(restOfString); //-- , -z , y- , yz
        ArrayList<String> my_result = new ArrayList<>();
        for(String resultString: recursion_result){
            String my_string = "-" + resultString;
            my_result.add(my_string);
        }// --- , --z , -y- , -yz

        for(String resultString: recursion_result){
            String my_string = ch + resultString;
            my_result.add(my_string);
        }// x-- , x-z , xy- , xyz

        return my_result;
    }
}