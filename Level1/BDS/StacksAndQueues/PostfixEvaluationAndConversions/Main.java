package Level1.BDS.StacksAndQueues.PostfixEvaluationAndConversions;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> value = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> prefix = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (Character.isDigit(ch)) {
                value.push(ch - '0');
                infix.push(ch + "");
                prefix.push(ch + "");
            } else {
                int op2 = value.pop();
                int op1 = value.pop();
                int ans = operation(ch, op1, op2);
                value.push(ans);
                String opp2 = infix.pop();
                String opp1 = infix.pop();
                String oppp2 = prefix.pop();
                String oppp1 = prefix.pop();
                infix.push("(" + opp1 + ch + opp2 + ")");
                prefix.push(ch + oppp1 + oppp2 + "");
            }
        }
        System.out.println(value.pop());
        System.out.println(infix.pop());
        System.out.println(prefix.pop());
    }

    public static int operation(char ch, int op1, int op2) {
        if (ch == '+')
            return op1 + op2;
        else if (ch == '-')
            return op1 - op2;
        else if (ch == '/')
            return op1 / op2;
        else
            return op1 * op2;
    }
}