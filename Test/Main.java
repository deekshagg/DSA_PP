mport java.io.*;
import java.util.*;

public class Main{
  

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        Stack<Integer>operands=new Stack<>();
        Stack<Character>operators=new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            char ch=exp.charAt(i);

            if(ch=='(')
            {
                operators.push(ch);

            }else if(ch==')'){
                while(operators.size()>0 && operators.peek()!='(')
                {
                    char opv=operators.pop();
                    int v2=operands.pop();
                    int v1=operands.pop();
                    int ans=operations(v1,v2,opv);
                    operands.push(ans);
                }
                operators.pop();

            }else if(Character.isDigit(ch)){
                operands.push(ch-'0');

            }else{
                while(operators.size()>0&& operators.peek()!='(' && precedence(ch)<=precedence(operators.peek()))
                {
                    char opv=operators.pop();
                    int v2=operands.pop();
                    int v1=operands.pop();
                    int ans=operations(v1,v2,opv);
                    operands.push(ans);

                }
                operators.push(ch);

            }
        }
        while(operators.size()>0)
        {
            char opv=operators.pop();
            int v2=operands.pop();
            int v1=operands.pop();
            int ans=operations(v1,v2,opv);
            operands.push(ans);

        }
        System.out.println(operands.pop());
    }
    public static int precedence(char ch)
    {
        if(ch=='+'||ch=='-')
        {
            return 0;
        }else
        {
            return 1;
        }
    }
    public static int operations(int v1,int v2,char ch)
    {
        if(ch=='+')
        {
            return v1+v2;
        }else if(ch=='-')
        {
            return v1-v2;
        }else if(ch=='*')
        {
            return v1*v2;
        }else{
            return v1/v2;
        }
    }
}