package Level1.BDS.StacksAndQueues.DuplicateBrackets;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                if(st.peek() == '('){
                    System.out.println(true);
                    return;
                }else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        System.out.println(false);
    }

}







class Solution {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        haveDuplicateBrackets(str);
    }
    public static void haveDuplicateBrackets(String str){
        Stack<Character> stack = new Stack<>();
        for(Character ch: str.toCharArray()){
            if(ch == ')'){
                if(stack.peek() == '('){
                    System.out.println(true);
                    return;
                }else{
                    while(stack.peek() != '('){
                        stack.pop();
                    }
                    stack.pop();
                }
            }
            else stack.push(ch);
        }
        System.out.println(false);
    }

}