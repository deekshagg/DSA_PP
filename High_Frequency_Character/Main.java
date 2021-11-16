package High_Frequency_Character;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a string");
        String str = scn.next();

        int[] frequency_arr = new int[26]; // 0 pr a ki frequency , 1 pr b and so on 
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            int index_of_char = ch - 'a';
            frequency_arr[index_of_char]++;
        }

        int maxIndex = 0;
        for(int i = 1; i< frequency_arr.length ; i++){
            if(frequency_arr[i] > frequency_arr[maxIndex]){
                maxIndex = i;
            }
        }

        char highest_Frequency_Character = (char)(maxIndex + 'a');
        System.out.println("the highest frequency charcter in " + str + " is " + highest_Frequency_Character);
    }
}
