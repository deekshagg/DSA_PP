package Getting_started.Patterns.Pattern4;
public class Main {
    public static void main(String[] args) {
        int n = 5;
        int sp = 0;
        int st = n;
        for(int i =1 ; i<=n ; i++){

            for(int j=1 ; j<=sp; j++)
            {
                System.out.print(" \t");
                
            }
            for(int j=1 ; j<=st; j++)
            {
                System.out.print("*\t");
                
            }
            
            st--;
            sp++;
            System.out.println();
        }
    }
}
