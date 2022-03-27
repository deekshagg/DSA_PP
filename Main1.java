import java.util.*;
import java.text.*;

public class Main1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("ANU", 1);
        map.put("AUN", 1);
        map.put("NAU", 1);
        map.put("NUA", 1);
        map.put("UAN", 1);
        map.put("UNA", 1);
        int n = 3;
        int count = 0;
        char[] set = {'A', 'N', 'U'};
        while (t-- > 0) {
            int k = in.nextInt();
            ArrayList<String> ans = getAllKLengthRec(set, "", n, k);
            for(int i = 0 ; i < ans.size() ; i++) {
                for(int j = 3 ; j < ans.get(i).length() ; j++) {
                    if(map.containsKey(ans.get(i).substring(i, j))){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    static ArrayList<String> getAllKLengthRec(char[] set, String prefix, int n, int k) {
        if (k == 0) {
            // System.out.println(prefix);
            ArrayList<String> ans = new ArrayList<String>();
            return ans;
        }
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            
            String newPrefix = prefix + set[i];
            ArrayList<String> a = getAllKLengthRec(set, newPrefix, n, k - 1);

            arr = a;

        }
        return arr;
    }
}
