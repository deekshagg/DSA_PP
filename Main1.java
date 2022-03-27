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
        char[] set = {'A', 'N', 'U'};
        while (t-- > 0) {
            int n = in.nextInt();

        }
    }

    static void printAllKLengthRec(char[] set, String prefix, int n, int k) {
        if (k == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < n; ++i) {

            String newPrefix = prefix + set[i];

            printAllKLengthRec(set, newPrefix,
                    n, k - 1);
        }
    }
}
