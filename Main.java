public class Main {
    public static void main(String[] args) {
        // int i = 0, j= 0;
        int sum = 0;
        int[] arr = { 2, 5, 7, 4 };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[i] % 2 != arr[j] % 2)
                    arr[j] = arr[i] + arr[i];

                else
                    arr[j] = arr[j] + arr[j];

                sum = sum + arr[j];
            }
        }
        sum = sum / 5;
        System.out.println(sum);
    }
}
