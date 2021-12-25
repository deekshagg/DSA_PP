package recursion.on_wayup.printKPC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        printKPC(str , "");
    }
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String answerSoFar){    //196
        if(str.length() == 0){
            System.out.println(answerSoFar);
            return;
        }
        char ch = str.charAt(0);    //'1'
        String restOfQuestion = str.substring(1);   //'96'
        String code = codes[ch - 48];   //codes['1' - 48] = codes[1] = abc
        for(int i = 0 ; i < code.length() ; i++){
            char chCode = code.charAt(i);   // a, b, c
            printKPC(restOfQuestion, answerSoFar + chCode);
        }
    }
}
