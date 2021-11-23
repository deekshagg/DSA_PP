package getKPC;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str){ //196
        // base case
        if(str.length() == 0){
            ArrayList<String> baseWords = new ArrayList<>();
            baseWords.add("");
            return baseWords; 
        }
        char ch = str.charAt(0);// 1 ye jo bnega chracter m obtain hoga  => abc
        String restOfString = str.substring(1); // 96
        ArrayList<String> recursionResult = getKPC(restOfString); // 96 =yp , yq , yr , ys , zp , zq, zr ,zs
        ArrayList<String> myResult = new ArrayList<>(); //[]
        String code = codes[ch - 48]; // codes['1'- 48] == codes[1]  that is "abc"
        // character ki form m hai number isliye covert kra hai number
        // '1' != 1
        // '0' != 0   '0' == 48
        // '3' - 3 = 48     '1'== 49    '2'==50
        // char to integer convert nhi kr skte isliye bhi minus kra 
        for(int i=0 ; i<code.length() ; i++){ // abc 
            char charCode = code.charAt(i);  // a, b, c
            for(String resultString : recursionResult){  // yp , yq , yr , ys , zp , zq, zr ,zs
                myResult.add(charCode+resultString);
            }
        }
        return myResult;
    }
}
