public class ques{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int count = 0;
        if(arr[0] != arr[n - 1]) {
            for(int i = 1; i < n; i++) {
                if(arr[i] != arr[i - 1]) {
                    count++;
                }
            }
            System.out.println(count);
        }
        else
        System.out.println(0);
    }
}