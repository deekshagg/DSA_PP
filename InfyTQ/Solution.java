import java.util.*;

class Solution {
    public static int eularQueries(int Q, List<Integer> Queries) {

        int ans = 0;

        for(int i = 0 ; i < Queries.size() ; i++){
            ans += floor(Q/Queries.get(i)) * phi(Queries.get(i));
        }
        return ans;

    }

    public static int floor(int N) {
        return (int)Math.floor(N);
    }

    // A simple method to evaluate
    // Euler Totient Function
    public static int phi(int X) {
        ArrayList<Integer> phi = new ArrayList<>(X+1);
        phi.add(0,0);
        phi.add(1,1);
        
        for (int i = 2; i < X; i++)
            phi.set(phi.get(i-1), i);

        for(int i = 0 ; i <= X ; i++){
            for(int j = 2*i ; j <= X ; j++){
                phi.set(phi.get(j) - phi.get(i),j);
            }
        }
        return phi.get(2);
    } 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Q = Integer.parseInt(scan.nextLine().trim());
        List<Integer> Queries = new ArrayList<>(Q);
        for (int j = 0; j < Q; j++)
            Queries.add(Integer.parseInt(scan.nextLine().trim()));
        int result = eularQueries(Q, Queries);
        System.out.println(result);
    }
}