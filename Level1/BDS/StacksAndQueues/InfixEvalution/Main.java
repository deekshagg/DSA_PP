package Level1.BDS.StacksAndQueues.InfixEvalution;

import java.io.*;
import java.util.*;

public class Main{
  

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for(int i = 0 ; i < exp.length() ; i++){
            char ch = exp.charAt(i);
            if(ch == '('){
                operators.push(ch);
            }
            else if(Character.isDigit(ch)){
                operands.push(ch-48);
            }
            else if(ch == ')'){
                while(operators.size()>0 && operators.peek() != '(') {
                    char operator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int ans = operations(v1, v2, operator);
                    operands.push(ans);
                }
                operators.pop();
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while(operators.size()>0 && operators.peek() != '(' 
                        &&  precedence(ch) <= precedence(operators.peek())){
                            char operator = operators.pop();
                            int v2 = operands.pop();
                            int v1 = operands.pop();

                            int ans = operations(v1, v2, operator);
                            operands.push(ans);
                }
                operators.push(ch);
            }
        }
        while(operators.size()>0) {
            char operator = operators.pop();
            int v2 = operands.pop();
            int v1 = operands.pop();

            int ans = operations(v1, v2, operator);
            operands.push(ans);
        }
        System.out.println(operands.pop());
    }
    public static int precedence(char operator) {
        if(operator == '+' || operator == '-') return 1;
        else return 2;
    }
    public static int operations(int v1 , int v2, char operator) {
        if(operator == '+')
            return v1 + v2;
        else if(operator == '-')
            return v1 - v2;
        else if(operator == '*')
            return v1 * v2;
        else
            return v1 / v2;
    }
}